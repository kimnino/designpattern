package com.designpattern.factory;

public class SeoulCheeseBurger extends Hamburger {
    public SeoulCheeseBurger() {
        name = "서울치즈버거";
        sauce = "불닭소스";
        bread = "피카츄 베이커리 빵";
        toppings.add("올리브");
    }
}