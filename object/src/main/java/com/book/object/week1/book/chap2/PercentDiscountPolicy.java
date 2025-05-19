package com.book.object.week1.book.chap2;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
       return screening.getMovieFee().times(percent);
    }
}
