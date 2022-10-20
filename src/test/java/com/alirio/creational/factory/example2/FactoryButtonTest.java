package com.alirio.creational.factory.example2;

import com.ali.creational.factoryMethod.example2.buttons.factory.Dialog;
import com.ali.creational.factoryMethod.example2.buttons.factory.impl.HtmlDialog;
import com.ali.creational.factoryMethod.example2.buttons.factory.impl.WindowsDialog;
import org.junit.Test;

public class FactoryButtonTest {

    @Test
    public void probarWindowsButton(){
        Dialog dialog = new WindowsDialog();
        dialog.renderWindow();
    }

    @Test
    public void probarHtmlButton(){
        Dialog dialog = new HtmlDialog();
        dialog.renderWindow();
    }
}
