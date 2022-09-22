package com.ali.creational.abstractFactory.example1;

public class Credit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Pago a Credito";
    }
}
