package com.ali.creational.abstractFactory.example2;

public class ClassicChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Classic Chair: You sit on");
    }

    @Override
    public void hasLegs() {
        System.out.println("Classic Chair: It has 4 legs");
    }
}
