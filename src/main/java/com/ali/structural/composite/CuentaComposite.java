package com.ali.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CuentaComposite implements CuentaComponent {

    private List<CuentaComponent> childCuentas= new ArrayList<>();

    @Override
    public void showAccountName() {
        for (CuentaComponent cuenta : childCuentas) {
            cuenta.showAccountName();
        }
    }

    @Override
    public Double getAmount() {
        Double totalAmount = 0.0;
        for (CuentaComponent cuenta : childCuentas) {
            totalAmount += cuenta.getAmount();
        }
        return totalAmount;
    }

    public void addCuenta(CuentaComponent cuentaComponent){
        childCuentas.add(cuentaComponent);
    }

    public void removeCuenta(CuentaComponent cuentaComponent){
        childCuentas.remove(cuentaComponent);
    }


}

