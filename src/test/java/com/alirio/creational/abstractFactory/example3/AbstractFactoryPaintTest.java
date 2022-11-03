package com.alirio.creational.abstractFactory.example3;

import com.ali.creational.abstractFactory.example3.Application;
import com.ali.creational.abstractFactory.example3.factories.MacOSFactory;
import com.ali.creational.abstractFactory.example3.factories.WindowsFactory;
import org.junit.Test;

public class AbstractFactoryPaintTest {

    @Test
    public void windowsPaintTest(){
        Application application = new Application(new WindowsFactory());
        application.paint();
    }

    @Test
    public void macOSPaintTest(){
        Application application = new Application(new MacOSFactory());
        application.paint();
    }
}
