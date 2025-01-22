package com.designpattern.factory;

public class SeoulHamburgerIngredientFactory implements HamburgerIngredientFactory {
    @Override
    public Bread createBread() {
        return new SeoulBread();
    }

    @Override
    public Sauce createSauce() {
        return new SeoulSauce();
    }

    @Override
    public Cheese createCheese() {
        return new SeoulCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }
}
