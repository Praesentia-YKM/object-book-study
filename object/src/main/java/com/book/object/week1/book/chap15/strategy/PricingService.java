package com.book.object.week1.book.chap15.strategy;

import org.springframework.stereotype.Service;

// Context: 전략을 사용하는 객체
@Service
public class PricingService {
    private DiscountStrategy discountStrategy;

    public PricingService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void changeDiscountStrategy(DiscountStrategy newStrategy) {
        this.discountStrategy = newStrategy;
        System.out.println("할인 정책 변경: " + newStrategy.getStrategyName());
    }

    public int calculateFinalPrice(int originalPrice) {
        int discount = discountStrategy.calculateDiscount(originalPrice);
        int finalPrice = originalPrice - discount;

        System.out.println("원가: " + originalPrice + "원");
        System.out.println("할인 정책: " + discountStrategy.getStrategyName());
        System.out.println("할인액: " + discount + "원");
        System.out.println("최종 가격: " + finalPrice + "원");

        return finalPrice;
    }
}
