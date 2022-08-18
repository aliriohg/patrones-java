package com.ali.behavioral.chainofresponsability.impl;

import com.ali.behavioral.chainofresponsability.ApproveLoanChain;

public class Black implements ApproveLoanChain{
    private ApproveLoanChain next;

    @Override
    public void setNex(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if (totalLoan >= 50000) {
            System.out.println("Esta solicitud de tarjeta de credito la maneja la tarjeta black");
        }else {
            next.creditCardRequest(totalLoan);
        }
    }
}
