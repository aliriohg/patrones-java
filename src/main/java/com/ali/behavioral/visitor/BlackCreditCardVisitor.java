package com.ali.behavioral.visitor;

public class BlackCreditCardVisitor implements CreditCardVisitor{
    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("Descuento del 10% em gasolina con tu tarjeta Black");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Descuento del 15% en vuelos con la tarjeta Black");
    }
}
