package com.ali.creational.abstractFactory.example3.checkbox;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("WindowsCheckbox: painting...");
    }
}
