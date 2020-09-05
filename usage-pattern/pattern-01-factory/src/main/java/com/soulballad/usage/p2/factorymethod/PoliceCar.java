package com.soulballad.usage.p2.factorymethod;

public class PoliceCar implements ICar {

    @Override
    public void produce() {
        System.out.println("生产警用汽车");
    }
}