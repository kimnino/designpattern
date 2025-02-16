package com.designpattern.facade;

public class Tuner {
    Amplifier amplifier;

    void on() {
        System.out.println("Tuner is on");
    }

    void off() {
        System.out.println("Tuner is off");
    }
}
