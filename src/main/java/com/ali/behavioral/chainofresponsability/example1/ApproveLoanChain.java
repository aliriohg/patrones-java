package com.ali.behavioral.chainofresponsability.example1;

public interface ApproveLoanChain {
     void setNex(ApproveLoanChain loan);
     ApproveLoanChain getNext();
     void creditCardRequest(int totalLoan);

}
