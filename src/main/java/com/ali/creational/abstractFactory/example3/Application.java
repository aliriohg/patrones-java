package com.ali.creational.abstractFactory.example3;

import com.ali.creational.abstractFactory.example3.buttons.Button;
import com.ali.creational.abstractFactory.example3.checkbox.Checkbox;
import com.ali.creational.abstractFactory.example3.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox= guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
