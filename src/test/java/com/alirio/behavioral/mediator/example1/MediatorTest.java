package com.alirio.behavioral.mediator.example1;

import com.ali.behavioral.mediator.example1.ConcreteCollage1;
import com.ali.behavioral.mediator.example1.ConcreteCollage2;
import com.ali.behavioral.mediator.example1.ConcreteMediator;
import org.junit.Test;

public class MediatorTest {
    @Test
    private static void probarMediator() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteCollage1 user1 = new ConcreteCollage1(mediator);
        ConcreteCollage2 user2 = new ConcreteCollage2(mediator);
        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hola soy el user1");
    }
}
