package com.ali.creational.abstractFactory.example2;

public class ClassicFurnitureFactory extends AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ClassicCoffeeTable();
    }
}
