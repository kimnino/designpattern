package com.designpattern.factory;

public class SeoulHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {

        SeoulHamburgerIngredientFactory ingredientFactory = new SeoulHamburgerIngredientFactory();

        if ("cheese".equals(type)) {
            return new SeoulCheeseBurger(ingredientFactory);
        } else if ("chicken".equals(type)) {
            return new SeoulChickenBurger(ingredientFactory);
        } else if ("shrimp".equals(type)) {
            return new SeoulShrimpBurger(ingredientFactory);
        }

        return null;
    }
}
