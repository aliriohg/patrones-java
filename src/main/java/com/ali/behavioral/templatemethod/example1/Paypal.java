package com.ali.behavioral.templatemethod.example1;

public class Paypal extends Payment {
    @Override
    void initialize() {
        System.out.println("Inicializando el pago con paypal");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con paypal");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizado el pago por paypal");
    }
}
