package com.book.object.week1.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소
 * - 판매하거나 교환해 줄 티켓 목록
 * - 판매금액
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // 관객에게 티켓을 판매하고 이윤을 더하는 책임은 티켓오피스다.
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    // 제일 앞 티켓부터 하나씩 판매
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
