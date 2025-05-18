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

//    public Bag getBag() {
//        return bag;
//    }

    /* 티켓을 구매하는 행위는 극장이 아닌 관객의 책임이다.
       판매원이 가방을 강제로 꺼내서 초대장이 있는지 없는지 확인하는 것이 아닌,
       관객이 직접 자기 가방에서 초대장 유무를 확인하여 구매를 하는 것
       -> 캡슐화
     */
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
