package com.soulballad.usage.p3.abstractfactory;

public class BenzGasolineCar implements IGasolineCar {

    @Override
    public void refuel() {

        System.out.println("benz...refuel...");
    }
}