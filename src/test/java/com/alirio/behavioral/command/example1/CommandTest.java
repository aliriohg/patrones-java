package com.alirio.behavioral.command.example1;

import com.ali.behavioral.command.example1.CreditCard;
import com.ali.behavioral.command.example1.CreditCardActivateCommand;
import com.ali.behavioral.command.example1.CreditCardDisableCommand;
import com.ali.behavioral.command.example1.CreditCardInvoker;
import org.junit.Test;

public class CommandTest {

    @Test
    private static void probarCommand() {
        CreditCard creditCard = new CreditCard();
        CreditCardInvoker invoker = new CreditCardInvoker();
//        activar tarjeta
        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        System.out.println("-----------------");
//        desactivar tarjeta
        invoker.setCommand(new CreditCardDisableCommand(creditCard));
        invoker.run();
    }
}
