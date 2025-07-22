package com.book.object.week1.book.chap15.bridge;

import org.springframework.stereotype.Component;

@Component("pushChannel")
public class PushNotificationChannel implements NotificationChannel {
    @Override
    public void sendMessage(String recipient, String title, String content) {
        System.out.println("=== 푸시 알림 발송 ===");
        System.out.println("사용자 ID: " + recipient);
        System.out.println("푸시 제목: " + title);
        System.out.println("푸시 내용: " + content);
        System.out.println("푸시 알림이 성공적으로 발송되었습니다.\n");
    }

    @Override
    public String getChannelName() {
        return "푸시알림";
    }
}