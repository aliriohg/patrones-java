package com.ali.behavioral.observer;

public class Peaton implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.status.equals("ROJO_COCHE")){
            System.out.println("Semaforo VERDE para peaton: -> Peaton SI puede pasar");
        }else {
            System.out.println("Semaforo ROJO para peaton: -> Peaton NO puede pasar");
        }
    }
}
