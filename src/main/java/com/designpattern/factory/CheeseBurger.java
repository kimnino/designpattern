package com.designpattern.factory;

public class CheeseBurger implements Hamburger {
    @Override
    public void prepare() {
        System.out.println("Preparing CheeseBurger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking CheeseBurger");
    }

    @Override
    public void wrap() {
        System.out.println("Wrapping CheeseBurger");
    }
}