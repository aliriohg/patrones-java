package com.ali.behavioral.chainofresponsability.impl;

import com.ali.behavioral.chainofresponsability.ApproveLoanChain;

public class Tarjeta implements ApproveLoanChain {
    private ApproveLoanChain next;

    @Override
    public void setNex(ApproveLoanChain loan) {
        this.next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        Gold gold = new Gold();
        this.setNex(gold);

        Platinium platinium = new Platinium();
        gold.setNex(platinium);

        Black black = new Black();
        platinium.setNex(black);
        next.creditCardRequest(totalLoan);
    }
}
