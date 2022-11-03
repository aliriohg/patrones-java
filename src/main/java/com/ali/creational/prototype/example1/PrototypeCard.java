package com.ali.creational.prototype.example1;

public interface PrototypeCard extends Cloneable{

    void getCard();

    PrototypeCard clone() throws CloneNotSupportedException;
}
