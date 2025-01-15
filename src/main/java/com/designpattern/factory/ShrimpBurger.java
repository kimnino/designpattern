package com.designpattern.factory;

public class ShrimpBurger implements Hamburger {
    @Override
    public void prepare() {
        System.out.println("Preparing ShrimpBurger");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ShrimpBurger");
    }

    @Override
    public void wrap() {
        System.out.println("Wrapping ShrimpBurger");
    }
}