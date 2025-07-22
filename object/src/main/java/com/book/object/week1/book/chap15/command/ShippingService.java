package com.book.object.week1.book.chap15.command;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public void arrangeShipping(Long orderId, String address) {
        System.out.println("주문 " + orderId + "를 " + address + "로 배송 준비");
    }

    public void cancelShipping(Long orderId) {
        System.out.println("주문 " + orderId + " 배송 취소");
    }
}
