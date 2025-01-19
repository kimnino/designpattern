package com.designpattern.factory;

public class SeoulChickenBurger extends Hamburger {
    public SeoulChickenBurger() {
        name = "서울치킨버거";
        sauce = "뿌링소스";
        bread = "허니버터빵";
        toppings.add("신당동 떡볶이 소스");
    }
}