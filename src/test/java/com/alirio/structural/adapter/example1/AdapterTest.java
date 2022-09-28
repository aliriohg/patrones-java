package com.alirio.structural.adapter.example1;

import com.ali.structural.adapter.example1.CreditCard;
import org.junit.Test;

public class AdapterTest {
    @Test
    private static void probarAdapter() {
        CreditCard creditCard = new CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
    }
}
