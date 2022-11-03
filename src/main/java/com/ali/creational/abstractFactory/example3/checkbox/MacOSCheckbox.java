package com.ali.creational.abstractFactory.example3.checkbox;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("MacOSCheckbox: painting...");
    }
}
