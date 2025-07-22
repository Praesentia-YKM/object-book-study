package com.book.object.week1.book.chap15.observer;

import org.springframework.stereotype.Component;

// Concrete Observers: 재고 변화에 반응하는 각 부서들
@Component
public class PurchasingDepartmentObserver implements StockObserver {
    private static final int REORDER_THRESHOLD = 10;

    @Override
    public void onStockChanged(String productName, int newStock, int previousStock) {
        if (newStock < REORDER_THRESHOLD && previousStock >= REORDER_THRESHOLD) {
            System.out.println("[구매팀] " + productName + " 재고 부족 감지! 긴급 발주 필요 (현재 재고: " + newStock + ")");
        }
    }

    @Override
    public String getObserverName() {
        return "구매팀";
    }
}
