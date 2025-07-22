package com.book.object.week1.book.chap15.bridge;

import org.springframework.stereotype.Component;

@Component("smsChannel")
public class SmsNotificationChannel implements NotificationChannel {
    @Override
    public void sendMessage(String recipient, String title, String content) {
        System.out.println("=== SMS 발송 ===");
        System.out.println("전화번호: " + recipient);
        System.out.println("메시지: [" + title + "] " + content);
        System.out.println("SMS가 성공적으로 발송되었습니다.\n");
    }

    @Override
    public String getChannelName() {
        return "SMS";
    }
}
