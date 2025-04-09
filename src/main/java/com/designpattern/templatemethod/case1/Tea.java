package com.designpattern.templatemethod.case1;

public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping tea bag");
    }

    public void pourInCup() {
        System.out.println("pouring cup");
    }

    public void addLemon() {
        System.out.println("adding lemon");
    }
}
