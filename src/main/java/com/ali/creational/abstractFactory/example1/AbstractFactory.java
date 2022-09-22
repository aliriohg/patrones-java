package com.ali.creational.abstractFactory.example1;

public interface AbstractFactory<T> {
    public T create(String type);
}
