package com.designpattern.strategy;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓으로 날 수 있어요.");
    }
}
