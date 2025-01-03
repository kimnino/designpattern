package com.designpattern.observer.example;

public class MartDisplay implements Display, Observer {

    private String name;
    private double price;
    private Goods goods;

    public MartDisplay(Goods goods) {
        this.goods = goods;
        goods.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("[마트 진열장]" + this.name + " 상품의 가격은 " + this.price + "원 입니다.");
    }

    @Override
    public void update() {
        this.name = goods.getName();
        this.price = goods.getPrice();
        display();
    }
}
