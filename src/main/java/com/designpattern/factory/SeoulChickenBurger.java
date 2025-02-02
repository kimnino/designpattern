package com.designpattern.factory;

public class SeoulChickenBurger extends Hamburger {
    HamburgerIngredientFactory ingredientFactory;

    public SeoulChickenBurger(HamburgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("준비중입니다. 서울치킨버거!!");
        bread = ingredientFactory.createBread();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}