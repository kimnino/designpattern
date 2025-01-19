package com.designpattern.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Hamburger {

    String name;
    String bread;
    String sauce;
    List<String> toppings = new ArrayList<>();


    public void prepare() {
        System.out.println(name + " ----> 준비중입니다");
        System.out.println(bread + " ----> 준비중입니다");
        System.out.println(sauce + " ----> 준비중입니다");
        toppings.stream().forEach(topping -> System.out.print(topping + " -----> 준비!!"));
        System.out.println();
    }

    public void cook() {
        System.out.println("빵위에 토핑을 올리고, 소스를 뿌리고 다시 빵을 올린다");
    }

    public void wrap() {
        System.out.println("햄버거를 포장지로 감싼다.");
    }

    public String getName() {
        return name;
    }
}
