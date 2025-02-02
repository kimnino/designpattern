package com.designpattern.command;

public class PushCommand implements Command {

    Push push;

    public PushCommand(Push push) {
        this.push = push;
    }

    public void execute() {
        push.push();
    }

}
