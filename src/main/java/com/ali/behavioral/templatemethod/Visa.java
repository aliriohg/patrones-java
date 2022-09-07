package com.ali.behavioral.templatemethod;

public class Visa extends Payment {
    @Override
    void initialize() {
        System.out.println("Inicializando el pago con visa");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con visa");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizado el pago por visa");
    }
}
