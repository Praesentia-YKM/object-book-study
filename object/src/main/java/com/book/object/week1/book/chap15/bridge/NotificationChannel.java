package com.book.object.week1.book.chap15.bridge;

// ===== BRIDGE 패턴 - 알림 시스템 =====
// 추상화(알림 타입)와 구현(알림 채널)을 분리하는 패턴

// Implementation: 실제 알림을 보내는 방법들
public interface NotificationChannel {
    void sendMessage(String recipient, String title, String content);
    String getChannelName();
}
