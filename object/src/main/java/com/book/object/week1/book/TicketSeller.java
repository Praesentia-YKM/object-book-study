package com.book.object.week1.book;

/**
 * 판매원은 자기가 일하는 매표소를 알고있어야 한다.
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
