package com.ali.creational.factoryMethod.example2.buttons.impl;

import com.ali.creational.factoryMethod.example2.buttons.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
        onClick();
    }

    @Override
    public void onClick() {
System.out.println("Windows Button Click! Button says - 'Hello World!'");
    }
}
