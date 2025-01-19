package com.designpattern.factory;

public class BusanHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        if ("cheese".equals(type)) {
            return new BusanCheeseBurger();
        } else if ("chicken".equals(type)) {
            return new BusanChickenBurger();
        } else if ("shrimp".equals(type)) {
            return new BusanShrimpBurger();
        }

        return null;
    }
}
