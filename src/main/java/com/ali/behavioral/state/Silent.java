package com.ali.behavioral.state;

import javax.annotation.processing.SupportedSourceVersion;

public class Silent implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext mobileAlertStateContext) {
        System.out.println("Silent... alert");
    }
}
