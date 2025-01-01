package com.designpattern.strategy.example;

public class TreeHarvest implements HarvestStrategy {
    @Override
    public void harvest() {
        System.out.println("나무에서 수확합니다.");
    }
}
