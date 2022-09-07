package com.ali.behavioral.strategy;

public class LowerStrategyTestFormatter implements StrategyTextFormatter {


    @Override
    public void format(String text) {
        System.out.println("Texto en minusculas: " + text.toLowerCase());
    }
}
