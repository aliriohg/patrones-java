package com.ali.structural.decorator.example1;

public class SecureDecorator extends CreditDecorator{
    public SecureDecorator(Credit decoratorCredit) {
        super(decoratorCredit);
    }

    @Override
    public void showCredit() {
    this.decoratorCredit.showCredit();
    configureSecure();
    }

    private void configureSecure() {
        System.out.println("La tarjeta ha sido configurada con seguridad maxima");
    }

}
