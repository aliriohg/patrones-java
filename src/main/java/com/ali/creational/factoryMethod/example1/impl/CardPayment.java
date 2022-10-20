package com.ali.creational.factoryMethod.example1.impl;

import com.ali.creational.factoryMethod.example1.Payment;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pago por tarjeta");
    }
}
