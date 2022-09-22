package com.alirio.creational.abstractFactory.example1;

import com.ali.creational.abstractFactory.example1.AbstractFactory;
import com.ali.creational.abstractFactory.example1.Card;
import com.ali.creational.abstractFactory.example1.FactoryProvider;
import com.ali.creational.abstractFactory.example1.PaymentMethod;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    private void abstractFactoryTest() {
        AbstractFactory cardAbstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) cardAbstractFactory.create("VISA");
        AbstractFactory patmentAbstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) patmentAbstractFactory1.create("DEBIT");
        System.out.println("Una tarjeta de tipo: " + tarjeta.getCardType() + " con el metodo de pago: " + paymentMethod.doPayment());
    }
}
