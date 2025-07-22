package com.book.object.week1.book.chap15.bridge;

// Abstraction: 알림의 종류들
public abstract class NotificationSender {
    protected final NotificationChannel channel; // Bridge to implementation

    protected NotificationSender(NotificationChannel channel) {
        this.channel = channel;
    }

    public abstract void sendNotification(String recipient);

    public void changeChannel(NotificationChannel newChannel) {
        // 런타임에 구현체 변경 가능 (브릿지의 핵심 장점)
        System.out.println("알림 채널 변경: " + newChannel.getChannelName());
    }
}
