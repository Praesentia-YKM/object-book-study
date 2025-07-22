package com.book.object.week1.book.chap15.observer;

// Subject 인터페이스
interface StockSubject {
    void attachObserver(StockObserver observer);
    void detachObserver(StockObserver observer);
    void notifyObservers(String productName, int newStock, int previousStock);
}
