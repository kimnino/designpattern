package com.designpattern.factory;

public class BusanCheeseBurger extends Hamburger {

    public BusanCheeseBurger() {
        name = "부산치즈버거";
        sauce = "부산식 소스";
        bread = "부산식 빵";
        toppings.add("부산어묵");
    }
}
