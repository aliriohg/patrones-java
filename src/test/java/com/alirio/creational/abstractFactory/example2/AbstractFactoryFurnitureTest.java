package com.alirio.creational.abstractFactory.example2;

import com.ali.creational.abstractFactory.example2.*;
import org.junit.Test;

public class AbstractFactoryFurnitureTest {

    @Test
    public void modernFurnitureTest() {
        AbstractFurnitureFactory factory = new ModernFurnitureFactory();

        Chair chair = factory.createChair();
        chair.sitOn();
        chair.hasLegs();

        Sofa sofa = factory.createSofa();
        sofa.places();

        CoffeeTable coffeeTable = factory.createCoffeeTable();
        coffeeTable.showStyle();
    }

    @Test
    public void classicFurnitureTest() {
        AbstractFurnitureFactory factory = new ClassicFurnitureFactory();

        Chair chair = factory.createChair();
        chair.sitOn();
        chair.hasLegs();

        Sofa sofa = factory.createSofa();
        sofa.places();

        CoffeeTable coffeeTable = factory.createCoffeeTable();
        coffeeTable.showStyle();
    }
}
