package com.alirio.behavioral.templatemethod.example1;

import com.ali.behavioral.templatemethod.example1.Paypal;
import com.ali.behavioral.templatemethod.example1.Visa;
import org.junit.Test;

public class TemplateMethodTest {

    @Test
    private static void probarTemplateMethod() {
        com.ali.behavioral.templatemethod.example1.Payment visa = new Visa();
        visa.makePayment();
        com.ali.behavioral.templatemethod.example1.Payment paypal = new Paypal();
        paypal.makePayment();

    }

}
