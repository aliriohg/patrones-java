package com.ali.creational.factoryMethod.example2.buttons.factory.impl;

import com.ali.creational.factoryMethod.example2.buttons.Button;
import com.ali.creational.factoryMethod.example2.buttons.factory.Dialog;
import com.ali.creational.factoryMethod.example2.buttons.impl.WindowsButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
