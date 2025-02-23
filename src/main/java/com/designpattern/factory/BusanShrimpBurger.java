package com.designpattern.factory;

public class BusanShrimpBurger extends Hamburger {
    HamburgerIngredientFactory ingredientFactory;

    public BusanShrimpBurger(HamburgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("준비중입니다. 부산새우버거!!");
        bread = ingredientFactory.createBread();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

