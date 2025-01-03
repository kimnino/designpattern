package com.designpattern.observer.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Goods implements Subject {

    @Getter
    private long id;
    @Getter
    private String name;
    @Getter
    private double price;
    private List<Observer> observers;

    public Goods() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void changeGoods() {
        notifyObservers();
    }

    public void refreshGoods(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        changeGoods();
    }
}
