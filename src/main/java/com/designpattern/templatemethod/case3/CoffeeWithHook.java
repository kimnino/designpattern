package com.designpattern.templatemethod.case3;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments(String answer) {
        return "y".equals(answer);
    }
}
