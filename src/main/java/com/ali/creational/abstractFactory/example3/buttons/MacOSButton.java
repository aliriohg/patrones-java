package com.ali.creational.abstractFactory.example3.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOSButton: painting .....");
    }
}
