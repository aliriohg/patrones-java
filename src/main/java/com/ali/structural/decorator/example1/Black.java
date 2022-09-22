package com.ali.structural.decorator.example1;

public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("El credito es de 1'000.0000");
    }
}
