package com.soulballad.usage.p3.abstractfactory;

public class AudiGasolineCar implements IGasolineCar {

    @Override
    public void refuel() {

        System.out.println("audi...refuel...");
    }
}