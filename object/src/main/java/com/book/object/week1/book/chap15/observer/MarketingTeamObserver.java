package com.book.object.week1.book.chap15.observer;

import org.springframework.stereotype.Component;

@Component
public class MarketingTeamObserver implements StockObserver {
    @Override
    public void onStockChanged(String productName, int newStock, int previousStock) {
        // 재고가 급격히 감소하면 인기 상품으로 판단하여 마케팅 활용
        int stockDecrease = previousStock - newStock;
        if (stockDecrease >= 20) {
            System.out.println("[마케팅팀] " + productName + " 인기 급상승! (" + stockDecrease + "개 판매) 프로모션 기획 검토");
        }
    }

    @Override
    public String getObserverName() {
        return "마케팅팀";
    }
}
