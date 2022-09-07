package com.ali.structural.adapter;

public class GoldCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        // No implemented
    }

    @Override
    public void payWithSecureLevelz() {
        System.out.println("Tarjeta Gold: Pagando con seguridad baja nivel Z");
    }
}
