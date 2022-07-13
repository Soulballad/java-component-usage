package com.soulballad.usage.pattern.p3.abstractfactory;

public class BenzGasolineCar implements IGasolineCar {

    @Override
    public void refuel() {

        System.out.println("benz...refuel...");
    }
}