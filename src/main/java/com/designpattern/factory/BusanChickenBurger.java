package com.designpattern.factory;

public class BusanChickenBurger extends Hamburger {
    HamburgerIngredientFactory ingredientFactory;


    public BusanChickenBurger(HamburgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing busan chiken burger");
        bread = ingredientFactory.createBread();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}