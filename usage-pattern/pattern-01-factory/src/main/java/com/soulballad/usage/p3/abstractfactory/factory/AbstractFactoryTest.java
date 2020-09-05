package com.soulballad.usage.p3.abstractfactory.factory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        AudiCarFactory audiCarFactory = new AudiCarFactory();
        audiCarFactory.getPoliceCar().ring();
        audiCarFactory.getElectricCar().charge();

        BenzCarFactory benzCarFactory = new BenzCarFactory();
        benzCarFactory.getPoliceCar().ring();
        benzCarFactory.getElectricCar().charge();
    }
}