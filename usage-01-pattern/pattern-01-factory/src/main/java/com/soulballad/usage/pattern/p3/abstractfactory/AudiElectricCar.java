package com.soulballad.usage.pattern.p3.abstractfactory;

public class AudiElectricCar implements IElectricCar {

    @Override
    public void charge() {

        System.out.println("audi...charge...");
    }
}