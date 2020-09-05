package com.soulballad.usage.p1.simplefactory;

public class GasolineCar implements ICar {

    @Override
    public void produce() {
        System.out.println("生产燃油车");
    }
}