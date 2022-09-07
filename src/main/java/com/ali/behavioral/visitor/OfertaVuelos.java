package com.ali.behavioral.visitor;

public class OfertaVuelos implements OfertaElement{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaVuelos(this);
    }
}
