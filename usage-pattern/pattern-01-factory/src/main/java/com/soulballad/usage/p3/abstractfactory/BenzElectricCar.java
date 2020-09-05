package com.soulballad.usage.p3.abstractfactory;

public class BenzElectricCar implements IElectricCar {

    @Override
    public void charge() {

        System.out.println("benz...charge...");
    }
}