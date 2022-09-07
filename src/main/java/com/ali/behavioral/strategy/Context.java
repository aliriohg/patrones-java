package com.ali.behavioral.strategy;

public class Context {

    private StrategyTextFormatter formatter;

    public Context(StrategyTextFormatter formatter) {
        this.formatter = formatter;
    }

    public void publishText(String text){
        formatter.format(text);
    }
}
