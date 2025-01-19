package com.designpattern.factory;

public class BusanChickenBurger extends Hamburger {
    public BusanChickenBurger() {
        name = "부산치킨버거";
        sauce = "부산식 매운 소스";
        bread = "부산식 통밀빵";
        toppings.add("씨앗호떡");
    }
}