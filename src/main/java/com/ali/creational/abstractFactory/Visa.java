package com.ali.creational.abstractFactory;

public class Visa implements Card{
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "123456";
    }
}
