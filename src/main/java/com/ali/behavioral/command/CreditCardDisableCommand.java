package com.ali.behavioral.command;

public class CreditCardDisableCommand implements Command {
    private CreditCard creditCard;

    public CreditCardDisableCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void executed() {
    creditCard.disable();
    creditCard.sendSMSToCustomerDisable();
    }
}
