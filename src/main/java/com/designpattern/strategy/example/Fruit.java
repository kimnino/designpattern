package com.designpattern.strategy.example;

public abstract class Fruit {
    HarvestStrategy harvestStrategy;

    public void harvest() {
        harvestStrategy.harvest();
    }

    public void setHarvestStrategy(HarvestStrategy hs) {
        this.harvestStrategy = hs;
    }
}
