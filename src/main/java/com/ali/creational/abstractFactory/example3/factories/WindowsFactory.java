package com.ali.creational.abstractFactory.example3.factories;

import com.ali.creational.abstractFactory.example3.buttons.Button;
import com.ali.creational.abstractFactory.example3.buttons.WindowsButton;
import com.ali.creational.abstractFactory.example3.checkbox.Checkbox;
import com.ali.creational.abstractFactory.example3.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
