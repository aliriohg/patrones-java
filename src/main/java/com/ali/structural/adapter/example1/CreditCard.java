package com.ali.structural.adapter.example1;

public class CreditCard implements Payment {

    Adapter adapter;

    @Override
    public void pay(String type) {
        if (type.equals("classic")) {
            System.out.println("Tarjeta Classic: Pagando sin ningun tipo de seguridad");
        } else {
            adapter = new Adapter(type);
            adapter.pay(type);
        }
    }
}
