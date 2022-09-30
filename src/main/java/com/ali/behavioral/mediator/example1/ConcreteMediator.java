package com.ali.behavioral.mediator.example1;

public class ConcreteMediator implements Mediator {

    private ConcreteCollage1 user1;
    private ConcreteCollage2 user2;

    public void setUser1(ConcreteCollage1 user1) {
        this.user1 = user1;
    }

    public void setUser2(ConcreteCollage2 user2) {
        this.user2 = user2;
    }

    @Override
    public void send(String message, Collage collage) {
        if (collage == user1) {
            user2.receivedMesage(message);
        }else if(collage==user2){
            user1.receivedMesage(message);
        }
    }
}
