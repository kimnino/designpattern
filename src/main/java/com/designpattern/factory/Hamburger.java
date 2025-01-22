package com.designpattern.factory;

import lombok.Getter;

import java.util.List;

public abstract class Hamburger {

    @Getter
    String name;
    Bread bread;
    Sauce sauce;
    Cheese cheese;
    List<Veggies> veggies;

    public abstract void prepare();

    public void cook() {
        System.out.println("빵위에 토핑을 올리고, 소스를 뿌리고 다시 빵을 올린다");
    }

    public void wrap() {
        System.out.println("햄버거를 포장지로 감싼다.");
    }

    @Override
    public String toString() {
        return name;
    }
}
