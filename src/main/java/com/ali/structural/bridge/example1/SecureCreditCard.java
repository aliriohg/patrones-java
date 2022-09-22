package com.ali.structural.bridge.example1;

public class SecureCreditCard implements ICreditCard {
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado CON SEGURIDAD");
    }
}
