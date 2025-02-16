package com.designpattern.facade;

public class Amplifier {

    Tuner tuner;
    StreamingPlayer player;

    void on() {
        System.out.println("Amplifier on");
    }

    void off() {
        System.out.println("Amplifier off");
    }


    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("Amplifier setStreamingPlayer" + player.toString());
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setSurroundSound");
    }

    public void setVolume(int i) {
        System.out.println("Amplifier setVolume" + i);
    }
}
