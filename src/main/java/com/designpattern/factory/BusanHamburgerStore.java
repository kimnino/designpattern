package com.designpattern.factory;

public class BusanHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {

        BusanHamburgerIngredientFactory ingredientFactory = new BusanHamburgerIngredientFactory();


        if ("cheese".equals(type)) {
            return new BusanCheeseBurger(ingredientFactory);

        } else if ("chicken".equals(type)) {
            return new BusanChickenBurger(ingredientFactory);
        } else if ("shrimp".equals(type)) {
            return new BusanShrimpBurger(ingredientFactory);
        }

        return null;
    }
}
