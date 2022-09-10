package com.ali.structural.proxy;

public class AccessToInternet implements Internet{
    @Override
    public void connectTo(String url) throws Exception {
        System.out.println("Navegando a la url: "+url);
    }
}
