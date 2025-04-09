package com.designpattern.templatemethod.case2;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("brewing Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
