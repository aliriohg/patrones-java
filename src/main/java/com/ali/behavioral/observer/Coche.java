package com.ali.behavioral.observer;

public class Coche implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.status.equals("ROJO_COCHE")){
            System.out.println("Semaforo ROJO para COCHE: -> COCHE NO puede pasar");
        }else {
            System.out.println("Semaforo VERDE para COCHE: -> COCHE SI puede pasar");
        }
    }
}
