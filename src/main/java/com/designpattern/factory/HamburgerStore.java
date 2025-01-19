package com.designpattern.factory;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type) {
        Hamburger hamburger;

        hamburger = createHamburger(type);

        hamburger.prepare();
        hamburger.cook();
        hamburger.wrap();

        return hamburger;
    }

    public abstract Hamburger createHamburger(String type);
}
