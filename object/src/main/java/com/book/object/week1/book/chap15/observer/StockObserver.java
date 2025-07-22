package com.book.object.week1.book.chap15.observer;

// ===== OBSERVER 패턴 - 재고 모니터링 시스템 =====
// 상태 변화를 여러 관찰자에게 자동으로 알려주는 패턴

// Observer 인터페이스
interface StockObserver {
    void onStockChanged(String productName, int newStock, int previousStock);
    String getObserverName();
}