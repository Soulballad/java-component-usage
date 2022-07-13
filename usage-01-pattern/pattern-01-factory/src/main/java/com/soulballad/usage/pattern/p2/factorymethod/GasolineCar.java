package com.soulballad.usage.pattern.p2.factorymethod;

public class GasolineCar implements ICar {

    @Override
    public void produce() {
        System.out.println("生产燃油车");
    }
}