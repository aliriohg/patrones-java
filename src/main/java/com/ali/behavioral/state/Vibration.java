package com.ali.behavioral.state;

public class Vibration implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext mobileAlertStateContext) {
        System.out.println("Vibrando... alarma");
    }
}
