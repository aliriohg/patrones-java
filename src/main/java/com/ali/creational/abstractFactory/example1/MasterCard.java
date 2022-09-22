package com.ali.creational.abstractFactory.example1;

public class MasterCard implements Card{
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "123456";
    }
}
