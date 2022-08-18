package com.ali.behavioral.chainofresponsability;

public interface ApproveLoanChain {
     void setNex(ApproveLoanChain loan);
     ApproveLoanChain getNext();
     void creditCardRequest(int totalLoan);

}
