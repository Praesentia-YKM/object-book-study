package com.book.object.week1.book;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 관객에게 가방을 꺼내서 초대장이 있는지 확인한다.
     * 만약 초대장이 들어있따면 이벤트에 당첨된 관람객이므로 판매원에게서 받은 티켓을 관람객의 가방안에 넣어준다.
     * 반대의 경우에는 가방안에 초대장이 없으면 티켓을 판매해야한다.
     * 판매할 때는 관람객의 가방에서 돈을 꺼내고, 소극장은 관람객의 가방안에 티켓을 넣어주고 수익분만큼 금액을 늘린다.
     */
    public void enter(Audience audience) {
        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
