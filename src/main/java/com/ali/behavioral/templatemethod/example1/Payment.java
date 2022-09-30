package com.ali.behavioral.templatemethod.example1;

public abstract class Payment {

    abstract void initialize();

    abstract void startPayment();

    abstract void endPayment();

    public final void makePayment() {
        initialize();
        startPayment();
        endPayment();
    }
}
