package com.designpattern.factory;

public class SeoulCheeseBurger extends Hamburger {
    HamburgerIngredientFactory ingredientFactory;

    public SeoulCheeseBurger(HamburgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("준비중입니다. 서울치즈버거!!");
        bread = ingredientFactory.createBread();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}