package com.ali.creational.factoryMethod;

import com.ali.creational.factoryMethod.impl.CardPayment;
import com.ali.creational.factoryMethod.impl.GooglePayment;

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
