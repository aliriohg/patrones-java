package com.ali.behavioral.interpreter;

public class TerminalExpression implements Expression {
    private String text;

    public TerminalExpression(String text) {
        this.text = text;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(text)) {
            return true;
        }
        return false;
    }
}
