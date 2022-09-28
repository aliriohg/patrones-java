package com.ali.behavioral.command.example1;

public class CreditCardActivateCommand implements Command{
    private CreditCard creditCard;

    public CreditCardActivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void executed() {
        creditCard.sendPinNumberToCustomer();
        creditCard.enable();
        creditCard.sendSMSToCustomerActivate();
    }
}
