package com.designpattern.templatemethod.case1;

public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("brewing coffee grinds");
    }

    public void pourInCup() {
        System.out.println("pouring cup");
    }

    public void addSugarAndMilk() {
        System.out.println("adding sugar and milk");
    }
}
