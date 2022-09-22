package com.ali.structural.decorator.example1;

public class InternationalPaymentDecorator extends CreditDecorator {
    public InternationalPaymentDecorator(Credit decoratorCredit) {
        super(decoratorCredit);
    }

    @Override
    public void showCredit() {
        this.decoratorCredit.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment() {
   System.out.println("La tarjeta ha sido configurada para hacer pagos internacionales");
    }


}
