package com.ali.creational.factoryMethod.impl;

import com.ali.creational.factoryMethod.Payment;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pago por tarjeta");
    }
}
