package com.ali.structural.facade;

public class Silver implements Credit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta sylver tiene un credito de 1.000");
    }
}
