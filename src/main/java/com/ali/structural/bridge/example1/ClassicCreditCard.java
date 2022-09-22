package com.ali.structural.bridge.example1;

public class ClassicCreditCard extends CreditCard{

    public ClassicCreditCard(ICreditCard creditCard) {
        super(creditCard);
    }

    @Override
    public void realizarPago() {
        creditCard.realizarPago();
    }
}