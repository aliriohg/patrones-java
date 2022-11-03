package com.ali.creational.abstractFactory.example3.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("WindowsButton: painting....");
    }
}
