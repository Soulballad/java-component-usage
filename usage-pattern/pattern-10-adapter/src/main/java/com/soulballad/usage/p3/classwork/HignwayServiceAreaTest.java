package com.soulballad.usage.p3.classwork;

public class HignwayServiceAreaTest {

    public static void main(String[] args) {

        HighWayServiceArea serviceArea = new HighWayServiceArea();
        serviceArea.service(new GasCar("汽油车"));
        serviceArea.service(new ElectricCar("电动汽车"));
    }
}