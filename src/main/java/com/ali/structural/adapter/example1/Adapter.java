package com.ali.structural.adapter.example1;


public class Adapter implements Payment {
    Secure secure;

    public Adapter(String type) {
        if (type.equals("black")) {
            secure = new BlackCreditCard();
        } else {
            secure = new GoldCreditCard();
        }
    }

    @Override
    public void pay(String type) {
        if (type.equals("black")) {
            secure.payWithSecureLevelA();
        } else {
            secure.payWithSecureLevelz();
        }
    }
}
