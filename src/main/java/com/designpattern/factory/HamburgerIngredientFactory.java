package com.designpattern.factory;

public interface HamburgerIngredientFactory {

    public Bread createBread();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();
}
