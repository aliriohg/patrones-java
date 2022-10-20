package com.ali.creational.factoryMethod.example2.buttons.factory.impl;

import com.ali.creational.factoryMethod.example2.buttons.Button;
import com.ali.creational.factoryMethod.example2.buttons.factory.Dialog;
import com.ali.creational.factoryMethod.example2.buttons.impl.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
