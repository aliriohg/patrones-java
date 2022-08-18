package com.ali.behavioral.command;

public class CreditCardInvoker {

    private Command command;

    public CreditCardInvoker() {
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run(){
        command.executed();
    }
}
