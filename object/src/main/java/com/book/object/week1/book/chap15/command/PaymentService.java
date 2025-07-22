package com.book.object.week1.book.chap15.command;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment(Long orderId, int amount) {
        System.out.println("주문 " + orderId + "에 대해 " + amount + "원 결제 처리");
    }

    public void refundPayment(Long orderId, int amount) {
        System.out.println("주문 " + orderId + "에 대해 " + amount + "원 환불 처리");
    }
}