package com.soulballad.usage.p2.factorymethod;

public class ElectricCar implements ICar {

    @Override
    public void produce() {
        System.out.println("生产电动车");
    }
}