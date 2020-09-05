package com.soulballad.usage.p1.simplefactory;

public class ElectricCar implements ICar {
    @Override
    public void produce() {
        System.out.println("生产电子汽车");
    }
}