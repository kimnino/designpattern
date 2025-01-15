package com.designpattern.factory;

public class HamburgerFactory {

    public Hamburger createHamburger(String type) {

        Hamburger hamburger = null;

        if ("cheese".equals(type)) {
            hamburger = new CheeseBurger();
        } else if ("chicken".equals(type)) {
            hamburger = new ChickenBurger();
        } else if ("shrimp".equals(type)) {
            hamburger = new ShrimpBurger();
        }

        return hamburger;
    }
}
