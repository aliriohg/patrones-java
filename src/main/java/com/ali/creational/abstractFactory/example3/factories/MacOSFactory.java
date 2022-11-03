package com.ali.creational.abstractFactory.example3.factories;

import com.ali.creational.abstractFactory.example3.buttons.Button;
import com.ali.creational.abstractFactory.example3.buttons.MacOSButton;
import com.ali.creational.abstractFactory.example3.checkbox.Checkbox;
import com.ali.creational.abstractFactory.example3.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
