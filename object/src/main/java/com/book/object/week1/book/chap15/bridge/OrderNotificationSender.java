package com.book.object.week1.book.chap15.bridge;

import org.springframework.stereotype.Component;

// Refined Abstractions: 구체적인 알림 타입들
@Component
public class OrderNotificationSender extends NotificationSender {
    private final String orderInfo;

    public OrderNotificationSender(NotificationChannel channel) {
        super(channel);
        this.orderInfo = "주문이 접수되었습니다";
    }

    public OrderNotificationSender(NotificationChannel channel, String orderInfo) {
        super(channel);
        this.orderInfo = orderInfo;
    }

    @Override
    public void sendNotification(String recipient) {
        channel.sendMessage(recipient, "주문 알림", orderInfo);
    }
}