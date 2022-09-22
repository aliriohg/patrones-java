package com.ali.structural.bridge.example1;

public abstract class CreditCard {
    protected ICreditCard creditCard;

    protected CreditCard(ICreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public abstract void realizarPago();
}
