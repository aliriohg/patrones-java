package com.ali.structural.facade;

public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta black tiene un credito de 1'000.000");
    }
}
