package com.ali.structural.facade;

public class CreditMarket {
    private Credit gold;
    private Credit black;
    private Credit silver;

    public CreditMarket() {
        this.gold = new Gold();
        this.black = new Black();
        this.silver = new Silver();
    }

    public void showCreditGold(){
        this.gold.showCredit();
    }

    public void showCreditSilver(){
        this.silver.showCredit();
    }
    public void showCredotBlack(){
        this.black.showCredit();
    }
}
