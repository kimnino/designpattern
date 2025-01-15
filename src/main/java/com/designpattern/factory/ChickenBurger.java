package com.designpattern.factory;

public class ChickenBurger implements Hamburger {
    @Override
    public void prepare() {
        System.out.println("Preparing ChickenBurger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ChickenBurger");
    }

    @Override
    public void wrap() {
        System.out.println("Wrapping ChickenBurger");
    }
}