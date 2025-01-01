package com.designpattern.strategy.example;

public class FieldHarvest implements HarvestStrategy {
    @Override
    public void harvest() {
        System.out.println("밭에서 수확합니다.");
    }
}
