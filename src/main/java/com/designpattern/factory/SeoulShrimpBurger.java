package com.designpattern.factory;

public class SeoulShrimpBurger extends Hamburger {
    HamburgerIngredientFactory ingredientFactory;

    public SeoulShrimpBurger(HamburgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("준비중입니다. 서울새우버거!!");
        bread = ingredientFactory.createBread();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
