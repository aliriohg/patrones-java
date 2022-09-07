package com.ali.structural.facade;

public class Gold implements Credit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta gold tiene un credito de 5.000");
    }
}
