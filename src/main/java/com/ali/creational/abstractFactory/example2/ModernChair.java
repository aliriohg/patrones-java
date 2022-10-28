package com.ali.creational.abstractFactory.example2;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Moder Chair: You sit on");
    }

    @Override
    public void hasLegs() {
        System.out.println("Moder Chair: It has 3 legs");
    }
}
