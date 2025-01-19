package com.designpattern.factory;

public class SeoulShrimpBurger extends Hamburger {
    public SeoulShrimpBurger() {
        name = "서울새우버거";
        sauce = "마요소스";
        bread = "페스츄리";
        toppings.add("새우깡");
        toppings.add("매운새우깡");
    }
}
