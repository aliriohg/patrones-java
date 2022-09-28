package com.ali.structural.adapter.example1;

public class BlackCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        System.out.println("Tarjeta Black: pagando con seguridad alta nivel A");
    }

    @Override
    public void payWithSecureLevelz() {
// Not implemented
    }
}
