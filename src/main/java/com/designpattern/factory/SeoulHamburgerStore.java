package com.designpattern.factory;

public class SeoulHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        if ("cheese".equals(type)) {
            return new SeoulCheeseBurger();
        } else if ("chicken".equals(type)) {
            return new SeoulChickenBurger();
        } else if ("shrimp".equals(type)) {
            return new SeoulShrimpBurger();
        }

        return null;
    }
}
