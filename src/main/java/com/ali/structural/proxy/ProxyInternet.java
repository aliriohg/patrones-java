package com.ali.structural.proxy;


import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new AccessToInternet();
    private static List<String> bannedUrl=new ArrayList<>();

    public ProxyInternet() {
        bannedUrl.add("facebook.com");
        bannedUrl.add("linkedin.com");
        bannedUrl.add("youtube.com");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if (bannedUrl.contains(url)) {
            throw new Exception("URL bloqueada - Acceso Denegado");
        }
        System.out.println("Navegando a la url por el proxy: " + url);
        internet.connectTo(url);
    }
}
