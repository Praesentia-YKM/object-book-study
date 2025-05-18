package com.book.object.week1.book.chap1;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 극장은 판매원과 관객을 알고 있으며, 판매원과 관객을 묶어준다.
     * - Audience는 함수의 매개변수를 통한 의존 : enter 메서드가 잠시 실행될 때 헤어진다.
     * - TicketSeller는 멤버변수를 통한 의존: 항상 극장은 판매원의 존재를 알고있다.
     * @param audience
     */
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
