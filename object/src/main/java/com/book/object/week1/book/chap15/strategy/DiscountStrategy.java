package com.book.object.week1.book.chap15.strategy;

// ===== STRATEGY 패턴 - 할인 정책 시스템 =====
// 런타임에 알고리즘을 선택할 수 있게 해주는 패턴

public interface DiscountStrategy {
    int calculateDiscount(int originalPrice);
    String getStrategyName();
}