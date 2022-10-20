package com.alirio.creational.factory.example1;

import com.ali.creational.factoryMethod.example1.Payment;
import com.ali.creational.factoryMethod.example1.PaymentFactory;
import com.ali.creational.factoryMethod.example1.TypePayment;
import org.junit.Test;

public class FactoryTest {

    @Test
    private static void probarFactoryMethod() {
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
