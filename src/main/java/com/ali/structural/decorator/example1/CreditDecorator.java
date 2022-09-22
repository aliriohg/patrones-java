package com.ali.structural.decorator.example1;

public abstract class CreditDecorator implements Credit{
   protected Credit decoratorCredit;

    public CreditDecorator(Credit decoratorCredit) {
        this.decoratorCredit = decoratorCredit;
    }

    @Override
    public abstract void showCredit();
}
