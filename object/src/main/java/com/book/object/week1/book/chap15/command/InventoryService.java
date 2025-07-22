package com.book.object.week1.book.chap15.command;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

// Receiver: 실제 작업을 수행하는 객체들
@Service
public class InventoryService {
    private final Map<String, Integer> inventory = new HashMap<>();

    public void decreaseStock(String productName, int quantity) {
        int currentStock = inventory.getOrDefault(productName, 100);
        inventory.put(productName, currentStock - quantity);
        System.out.println(productName + " 재고 " + quantity + "개 감소. 현재 재고: " + inventory.get(productName));
    }

    public void increaseStock(String productName, int quantity) {
        int currentStock = inventory.getOrDefault(productName, 100);
        inventory.put(productName, currentStock + quantity);
        System.out.println(productName + " 재고 " + quantity + "개 증가. 현재 재고: " + inventory.get(productName));
    }
}
