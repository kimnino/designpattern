package com.designpattern.facade;

public class Projector {
    StreamingPlayer player;

    void on() {
        System.out.println("Projector is on");
    }

    void off() {
        System.out.println("Projector is off");
    }

    public void wideScreenMode() {
        System.out.println("Projector is wideScreenMode");
    }
}
