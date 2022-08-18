package com.ali.behavioral.command;

public class CreditCard {

    public void sendPinNumberToCustomer() {
        System.out.println("El pin number ha sido enviado al cliente");
    }

    public void sendSMSToCustomerActivate() {
        System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido activada.");
    }

    public void enable() {
        System.out.println("La tarjeta ha sido activada");
    }

    public void disable() {
        System.out.println("La tarjeta ha sido desactivada");
    }
    public void sendSMSToCustomerDisable(){
        System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido desactivada.");
    }
}
