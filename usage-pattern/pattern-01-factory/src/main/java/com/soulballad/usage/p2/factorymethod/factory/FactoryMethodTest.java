package com.soulballad.usage.p2.factorymethod.factory;

public class FactoryMethodTest {

    public static void main(String[] args) {

        ICarFactory policeCarFactory = new PoliceCarFactory();
        policeCarFactory.getCar().produce();

        ElectricCarFactory electricCarFactory = new ElectricCarFactory();
        electricCarFactory.getCar().produce();
    }
}