package com.designpattern.observer.example;

public class CustomerPush implements Observer, Push {

    private String name;
    private double price;
    private Goods goods;

    public CustomerPush(Goods goods) {
        this.goods = goods;
        goods.registerObserver(this);
    }

    @Override
    public void update() {
        this.name = goods.getName();
        this.price = goods.getPrice();
        push();
    }

    @Override
    public void push() {
        System.out.println("고객님 현재 " + this.name + "의 가격이 " + this.price + "원 입니다.");
    }
}
