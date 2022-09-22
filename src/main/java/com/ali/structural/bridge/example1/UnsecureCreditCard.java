package com.ali.structural.bridge.example1;

public class UnsecureCreditCard implements ICreditCard {
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado SIN SEGURIDAD");
    }
}
