package com.designpattern.factory;

public class BusanShrimpBurger extends Hamburger {
    public BusanShrimpBurger() {
        name = "부산새우버거";
        sauce = "해운대 달콤 소스";
        bread = "해운대 모래빵";
        toppings.add("부산 앞 바다 광어");
    }
}