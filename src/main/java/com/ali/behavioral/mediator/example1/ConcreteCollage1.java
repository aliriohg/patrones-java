package com.ali.behavioral.mediator.example1;

public class ConcreteCollage1 extends Collage {

    public ConcreteCollage1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receivedMesage(String message) {
        System.out.println("Message received collage1 "+message);
    }
}
