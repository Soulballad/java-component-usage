package com.soulballad.usage.pattern.p3.abstractfactory;

public class AudiGasolineCar implements IGasolineCar {

    @Override
    public void refuel() {

        System.out.println("audi...refuel...");
    }
}