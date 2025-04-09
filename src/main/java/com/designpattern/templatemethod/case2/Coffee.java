package com.designpattern.templatemethod.case2;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
