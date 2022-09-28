package com.ali.behavioral.chainofresponsability.example1;

import com.ali.behavioral.chainofresponsability.example1.impl.Black;
import com.ali.behavioral.chainofresponsability.example1.impl.Gold;
import com.ali.behavioral.chainofresponsability.example1.impl.Platinium;

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
