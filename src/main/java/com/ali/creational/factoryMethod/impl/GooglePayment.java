package com.ali.creational.factoryMethod.impl;

import com.ali.creational.factoryMethod.Payment;

public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pago con Google");
    }
}
