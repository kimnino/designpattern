package com.designpattern.templatemethod.case3;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe(String answer) {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments(answer)) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring in cup");
    }

    boolean customerWantsCondiments(String answer) {
        return true;
    }
}
