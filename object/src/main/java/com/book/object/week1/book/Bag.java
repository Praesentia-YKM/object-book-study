package com.book.object.week1.book;

/**
 * 멤버변수를 보면 떠오르는 것:
 * 가방은 초대장, 티켓, 현금을 지니고 있다.
 *
 * 가방이 생성될 때는 어떤 것을 지니고 있어야 할까?
 * - 이벤트 당첨: 현금, 초대장
 * - 이벤트 미당첨: 현금
 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
