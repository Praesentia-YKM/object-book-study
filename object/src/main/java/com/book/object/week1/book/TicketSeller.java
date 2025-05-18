package com.book.object.week1.book;

/**
 * 판매원은 자기가 일하는 매표소를 알고있어야 한다.
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /*
        판매원은 티켓사무실을 외부에 제공하지 않고
        외부에서는 메시지를 통해 티켓사무실에서 티켓을 꺼내올 수 있다.
     */
//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    /* 관객에게 티켓을 파는 행위는 극장이 아닌 판매원이 한다.
       소극장입장 enter 라는 개념에서 판매원 입장 sellTo 라는 개념으로 변경되었다.
     */
    public void sellTo(Audience audience) {
        //ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
        ticketOffice.sellTicketTo(audience);
    }

}
