package com.book.object.week1.book;

/**
 * 관객은 무조건 가방을 필요로 한다.
 * 
 * 생성자를 보면 떠오르는 점: 이 객체가 생겨날 때 무조건 필요로 하는 (의존하는) 개념
 * - 관객은 가방없이 생겨날 수 없구나.
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
