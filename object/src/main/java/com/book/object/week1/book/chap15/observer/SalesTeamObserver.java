package com.book.object.week1.book.chap15.observer;

import org.springframework.stereotype.Component;

@Component
public class SalesTeamObserver implements StockObserver {
    @Override
    public void onStockChanged(String productName, int newStock, int previousStock) {
        if (newStock == 0) {
            System.out.println("[영업팀] " + productName + " 완전 품절! 고객 문의 대응 준비");
        } else if (newStock < 5) {
            System.out.println("[영업팀] " + productName + " 재고 부족 (잔여: " + newStock + "개) - 판매 조절 검토");
        }
    }

    @Override
    public String getObserverName() {
        return "영업팀";
    }
}
