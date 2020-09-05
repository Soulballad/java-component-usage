package com.soulballad.usage.p3.abstractfactory.factory;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test_abstractFactory() {

        AudiCarFactory audiCarFactory = new AudiCarFactory();
        audiCarFactory.getPoliceCar().refuel();
        audiCarFactory.getElectricCar().charge();

        BenzCarFactory benzCarFactory = new BenzCarFactory();
        benzCarFactory.getPoliceCar().refuel();
        benzCarFactory.getElectricCar().charge();
    }
}