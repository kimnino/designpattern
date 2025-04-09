package com.designpattern.templatemethod.case3;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("brewing Tea");
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
