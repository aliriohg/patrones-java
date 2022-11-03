package com.ali.creational.abstractFactory.example3.factories;

import com.ali.creational.abstractFactory.example3.buttons.Button;
import com.ali.creational.abstractFactory.example3.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
