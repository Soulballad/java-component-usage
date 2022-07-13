package com.soulballad.usage.pattern.p3.abstractfactory;

public class BenzElectricCar implements IElectricCar {

    @Override
    public void charge() {

        System.out.println("benz...charge...");
    }
}