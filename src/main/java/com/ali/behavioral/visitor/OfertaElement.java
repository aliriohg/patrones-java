package com.ali.behavioral.visitor;

public interface OfertaElement {
    void accept(CreditCardVisitor visitor);

}
