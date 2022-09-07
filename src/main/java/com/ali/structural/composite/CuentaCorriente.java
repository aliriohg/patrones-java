package com.ali.structural.composite;

public class CuentaCorriente implements CuentaComponent {

    private String name;
    private Double amount;

    public CuentaCorriente(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void showAccountName() {
        System.out.println("Cuenta Corriente: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
