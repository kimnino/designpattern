package com.designpattern.facade;

public class TheaterLights {

    void on() {
        System.out.println("조명 On");
    }

    void off() {
        System.out.println("조명 Off");
    }

    public void dim(int i) {
        System.out.println("조명 밝기는 :  " + i);
    }
}
