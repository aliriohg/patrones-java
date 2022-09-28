package com.alirio.behavioral.chainofresponsability.example1;

import com.ali.behavioral.chainofresponsability.example1.Tarjeta;
import org.junit.Test;

public class ChainOfResponsabilityTest {
    @Test
    private static void probarChainOfResponsability() {
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.creditCardRequest(60000);
    }

}
