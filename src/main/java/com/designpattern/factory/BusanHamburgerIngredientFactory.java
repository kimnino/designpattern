package com.designpattern.factory;

public class BusanHamburgerIngredientFactory implements HamburgerIngredientFactory {
    @Override
    public Bread createBread() {
        return new BusanBread();
    }

    @Override
    public Sauce createSauce() {
        return new BusanSauce();
    }

    @Override
    public Cheese createCheese() {
        return new BusanCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new RedPepper()};
    }
}
