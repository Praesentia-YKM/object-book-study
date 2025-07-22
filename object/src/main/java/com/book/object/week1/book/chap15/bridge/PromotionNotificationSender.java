package com.book.object.week1.book.chap15.bridge;

import org.springframework.stereotype.Component;

@Component
public class PromotionNotificationSender extends NotificationSender {
    private final String promotionInfo;

    public PromotionNotificationSender(NotificationChannel channel) {
        super(channel);
        this.promotionInfo = "특별 할인 이벤트가 시작되었습니다!";
    }

    public PromotionNotificationSender(NotificationChannel channel, String promotionInfo) {
        super(channel);
        this.promotionInfo = promotionInfo;
    }

    @Override
    public void sendNotification(String recipient) {
        channel.sendMessage(recipient, "프로모션 알림", promotionInfo);
    }
}
