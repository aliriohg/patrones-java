package com.alirio.structural.decorator.example1;

import com.ali.structural.decorator.example1.*;
import org.testng.annotations.Test;

public class DecoratorTest {

    @Test
    private void probarDecorator() {
        Credit gold = new Gold();

        Credit blackInternationalPayment = new InternationalPaymentDecorator(new Black());

        Credit goldSecureInternational = new InternationalPaymentDecorator(new SecureDecorator(new Black()));

        System.out.println("Tarjeta GOLD sin configuracion");
        gold.showCredit();
        System.out.println("Tarjeta GOLD con security y internation configuracion");
        goldSecureInternational.showCredit();
        System.out.println("Tarjeta Black con internation configuracion");
        blackInternationalPayment.showCredit();
    }
}
