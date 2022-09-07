package com.ali.structural.composite;

public class CuentaAhorro implements CuentaComponent{

    private String name;
    private Double amount;

    public CuentaAhorro(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void showAccountName() {
        System.out.println("Cuenta Ahorro: "+name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
