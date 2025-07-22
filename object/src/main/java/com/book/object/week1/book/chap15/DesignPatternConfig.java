package com.book.object.week1.book.chap15;

import com.book.object.week1.book.chap15.bridge.EmailNotificationChannel;
import com.book.object.week1.book.chap15.bridge.OrderNotificationSender;
import com.book.object.week1.book.chap15.bridge.PromotionNotificationSender;
import com.book.object.week1.book.chap15.bridge.SmsNotificationChannel;
import com.book.object.week1.book.chap15.strategy.DiscountStrategy;
import com.book.object.week1.book.chap15.strategy.PercentageDiscountStrategy;
import com.book.object.week1.book.chap15.strategy.PricingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DesignPatternConfig {

    @Bean
    @Primary
    public DiscountStrategy defaultDiscountStrategy() {
        return new PercentageDiscountStrategy(10); // 기본 10% 할인
    }

    @Bean
    public PricingService pricingService(DiscountStrategy defaultDiscountStrategy) {
        return new PricingService(defaultDiscountStrategy);
    }

    @Bean
    public OrderNotificationSender orderNotificationSender(EmailNotificationChannel emailChannel) {
        return new OrderNotificationSender(emailChannel);
    }

    @Bean
    public PromotionNotificationSender promotionNotificationSender(SmsNotificationChannel smsChannel) {
        return new PromotionNotificationSender(smsChannel);
    }
}
