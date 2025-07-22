package com.book.object.week1.book.chap15.strategy;

import org.springframework.stereotype.Component;

@Component("percentageDiscountStrategy")
public class PercentageDiscountStrategy implements DiscountStrategy {
    private final int discountPercentage;

    public PercentageDiscountStrategy() {
        this.discountPercentage = 10; // 기본 10% 할인
    }

    public PercentageDiscountStrategy(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int calculateDiscount(int originalPrice) {
        return (int) (originalPrice * discountPercentage / 100.0);
    }

    @Override
    public String getStrategyName() {
        return discountPercentage + "% 할인";
    }
}