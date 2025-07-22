package com.book.object.week1.book.chap15.bridge;

import org.springframework.stereotype.Component;

@Component("emailChannel")
public class EmailNotificationChannel implements NotificationChannel {
    @Override
    public void sendMessage(String recipient, String title, String content) {
        System.out.println("=== 이메일 발송 ===");
        System.out.println("받는이: " + recipient);
        System.out.println("제목: " + title);
        System.out.println("내용: " + content);
        System.out.println("이메일이 성공적으로 발송되었습니다.\n");
    }

    @Override
    public String getChannelName() {
        return "이메일";
    }
}

