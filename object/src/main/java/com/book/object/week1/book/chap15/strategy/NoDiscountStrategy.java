package com.book.object.week1.book.chap15.strategy;

import org.springframework.stereotype.Component;

@Component("noDiscountStrategy")
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public int calculateDiscount(int originalPrice) {
        return 0;
    }

    @Override
    public String getStrategyName() {
        return "할인 없음";
    }
}
