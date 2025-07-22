package com.book.object.week1.book.chap15;

import com.book.object.week1.book.chap15.bridge.EmailNotificationChannel;
import com.book.object.week1.book.chap15.bridge.NotificationChannel;
import com.book.object.week1.book.chap15.bridge.NotificationSender;
import com.book.object.week1.book.chap15.bridge.OrderNotificationSender;
import com.book.object.week1.book.chap15.bridge.PromotionNotificationSender;
import com.book.object.week1.book.chap15.bridge.PushNotificationChannel;
import com.book.object.week1.book.chap15.bridge.SmsNotificationChannel;
import com.book.object.week1.book.chap15.command.InventoryService;
import com.book.object.week1.book.chap15.observer.EnhancedInventoryService;
import com.book.object.week1.book.chap15.observer.MarketingTeamObserver;
import com.book.object.week1.book.chap15.observer.PurchasingDepartmentObserver;
import com.book.object.week1.book.chap15.observer.SalesTeamObserver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patterns")
public class DesignPatternController {

    private final EnhancedInventoryService inventoryService;
    private final EmailNotificationChannel emailChannel;
    private final SmsNotificationChannel smsChannel;
    private final PushNotificationChannel pushChannel;

    public DesignPatternController(EnhancedInventoryService inventoryService,
                                         EmailNotificationChannel emailChannel,
                                         SmsNotificationChannel smsChannel,
                                         PushNotificationChannel pushChannel) {
        this.inventoryService = inventoryService;
        this.emailChannel = emailChannel;
        this.smsChannel = smsChannel;
        this.pushChannel = pushChannel;
    }

    @PostMapping("/bridge/notification")
    public ResponseEntity<String> demonstrateBridgePattern(@RequestParam String type,
                                                          @RequestParam String channel,
                                                          @RequestParam String recipient) {
        // 런타임에 채널 선택 (브릿지 패턴의 핵심)
        NotificationChannel selectedChannel;
        switch (channel.toLowerCase()) {
            case "email": selectedChannel = emailChannel; break;
            case "sms": selectedChannel = smsChannel; break;
            case "push": selectedChannel = pushChannel; break;
            default: selectedChannel = emailChannel;
        }

        // 알림 타입에 따라 다른 발송자 생성
        NotificationSender sender;
        if ("order".equals(type)) {
            sender = new OrderNotificationSender(selectedChannel, "고객님의 주문이 성공적으로 처리되었습니다.");
        } else {
            sender = new PromotionNotificationSender(selectedChannel, "지금 구매하시면 30% 할인!");
        }

        sender.sendNotification(recipient);

        return ResponseEntity.ok("알림 발송 완료: " + selectedChannel.getChannelName());
    }

    @PostMapping("/observer/setup")
    public ResponseEntity<String> setupStockObservers() {
        // 각 부서 옵저버들을 재고 모니터링에 등록
        inventoryService.attachObserver(new PurchasingDepartmentObserver());
        inventoryService.attachObserver(new SalesTeamObserver());
        inventoryService.attachObserver(new MarketingTeamObserver());

        return ResponseEntity.ok("재고 모니터링 시스템이 활성화되었습니다.");
    }

    @PostMapping("/observer/stock-change")
    public ResponseEntity<String> simulateStockChange(@RequestParam String product,
                                                     @RequestParam int quantity,
                                                     @RequestParam String action) {
        System.out.println("현재 " + product + " 재고: " + inventoryService.getCurrentStock(product) + "개");

        if ("decrease".equals(action)) {
            inventoryService.decreaseStock(product, quantity);
        } else {
            inventoryService.increaseStock(product, quantity);
        }

        return ResponseEntity.ok("재고 변경 완료");
    }
}