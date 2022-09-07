package com.ali.structural.bridge;

public class ClassicCreditCard extends CreditCard{

    public ClassicCreditCard(ICreditCard creditCard) {
        super(creditCard);
    }

    @Override
    public void realizarPago() {
        creditCard.realizarPago();
    }
}