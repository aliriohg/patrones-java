package com.ali.creational.factoryMethod.example1;

import com.ali.creational.factoryMethod.example1.impl.CardPayment;
import com.ali.creational.factoryMethod.example1.impl.GooglePayment;

public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
            default:
                return new CardPayment();

        }
    }
}
