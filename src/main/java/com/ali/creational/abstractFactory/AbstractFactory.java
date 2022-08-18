package com.ali.creational.abstractFactory;

public interface AbstractFactory<T> {
    public T create(String type);
}
