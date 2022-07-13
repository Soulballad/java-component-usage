package com.soulballad.usage.pattern.p2.factorymethod;

public class ElectricCar implements ICar {

    @Override
    public void produce() {
        System.out.println("生产电动车");
    }
}