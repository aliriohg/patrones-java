package com.ali.creational.singleton;

public class CardSingleton {
    private static CardSingleton INSTANCE;

    private String cardNumber;

    private CardSingleton(){

    }

    public synchronized static CardSingleton getINSTANCE(){
        if(INSTANCE==null){
            INSTANCE = new CardSingleton();
        }
        return INSTANCE;
    }

    public static void setINSTANCE(CardSingleton INSTANCE) {
        CardSingleton.INSTANCE = INSTANCE;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
