package com.designpattern.facade;

public class StreamingPlayer {
    Amplifier amplifier;

    void on() {
        System.out.println("StreamingPlayer on");
    }

    void off() {
        System.out.println("StreamingPlayer off");
    }

    @Override
    public String toString() {
        return "스트리밍 플레이어";
    }

    public void play(String movie) {
        System.out.println(movie + " 플레이");
    }
}
