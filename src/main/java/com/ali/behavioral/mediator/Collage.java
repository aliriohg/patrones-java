package com.ali.behavioral.mediator;

public abstract class Collage {

    protected Mediator mediator;

    public Collage(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receivedMesage(String message);

}
