package com.book.object.week1.book.chap15.strategy;

import org.springframework.stereotype.Component;

@Component("fixedAmountDiscountStrategy")
public class FixedAmountDiscountStrategy implements DiscountStrategy {
    private final int discountAmount;

    public FixedAmountDiscountStrategy() {
        this.discountAmount = 1000; // 기본 1000원 할인
    }

    public FixedAmountDiscountStrategy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int calculateDiscount(int originalPrice) {
        return Math.min(discountAmount, originalPrice); // 원가보다 큰 할인은 불가
    }

    @Override
    public String getStrategyName() {
        return discountAmount + "원 할인";
    }
}
