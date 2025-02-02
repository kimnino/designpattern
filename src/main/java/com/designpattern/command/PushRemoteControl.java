package com.designpattern.command;

public class PushRemoteControl {
    Command slot;

    public PushRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPushed() {
        slot.execute();
    }

}
