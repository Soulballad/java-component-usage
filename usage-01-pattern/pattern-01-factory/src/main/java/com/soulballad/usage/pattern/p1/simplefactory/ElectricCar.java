package com.soulballad.usage.pattern.p1.simplefactory;

public class ElectricCar implements ICar {
    @Override
    public void produce() {
        System.out.println("生产电动车");
    }
}