package com.book.object.week1.book.chap15.observer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Enhanced InventoryService (Subject 역할 추가)
@Service
public class EnhancedInventoryService implements StockSubject {
    private final Map<String, Integer> inventory = new HashMap<>();
    private final List<StockObserver> observers = new ArrayList<>();

    @Override
    public void attachObserver(StockObserver observer) {
        observers.add(observer);
        System.out.println(observer.getObserverName() + "이(가) 재고 모니터링에 등록되었습니다.");
    }

    @Override
    public void detachObserver(StockObserver observer) {
        observers.remove(observer);
        System.out.println(observer.getObserverName() + "이(가) 재고 모니터링에서 해제되었습니다.");
    }

    @Override
    public void notifyObservers(String productName, int newStock, int previousStock) {
        System.out.println("=== 재고 변화 감지: " + productName + " (" + previousStock + " → " + newStock + ") ===");
        observers.forEach(observer -> observer.onStockChanged(productName, newStock, previousStock));
        System.out.println();
    }

    public void updateStock(String productName, int newStock) {
        int previousStock = inventory.getOrDefault(productName, 0);
        inventory.put(productName, newStock);

        // 재고 변화가 있을 때만 옵저버들에게 알림
        if (newStock != previousStock) {
            notifyObservers(productName, newStock, previousStock);
        }
    }

    public void decreaseStock(String productName, int quantity) {
        int currentStock = inventory.getOrDefault(productName, 100);
        int newStock = Math.max(0, currentStock - quantity); // 음수 방지
        updateStock(productName, newStock);
    }

    public void increaseStock(String productName, int quantity) {
        int currentStock = inventory.getOrDefault(productName, 0);
        updateStock(productName, currentStock + quantity);
    }

    public int getCurrentStock(String productName) {
        return inventory.getOrDefault(productName, 0);
    }
}

