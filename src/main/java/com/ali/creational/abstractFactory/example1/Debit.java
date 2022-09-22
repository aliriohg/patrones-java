package com.ali.creational.abstractFactory.example1;

public class Debit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Pago a Debito";
    }
}
