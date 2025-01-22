package com.designpattern.factory;

public class BusanCheeseBurger extends Hamburger {
    HamburgerIngredientFactory ingredientFactory;


    public BusanCheeseBurger(HamburgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing busan cheese burger");
        bread = ingredientFactory.createBread();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}
