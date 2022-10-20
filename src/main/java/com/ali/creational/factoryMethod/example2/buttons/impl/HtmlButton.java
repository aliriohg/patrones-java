package com.ali.creational.factoryMethod.example2.buttons.impl;

import com.ali.creational.factoryMethod.example2.buttons.Button;

public class HtmlButton implements Button {


    @Override
    public void render() {
        System.out.println("<button> Test Button </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
