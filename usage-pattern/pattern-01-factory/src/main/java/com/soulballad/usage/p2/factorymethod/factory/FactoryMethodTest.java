package com.soulballad.usage.p2.factorymethod.factory;

import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void test_factoryMethod() {

        ICarFactory policeCarFactory = new GasolineCarFactory();
        policeCarFactory.getCar().produce();

        ElectricCarFactory electricCarFactory = new ElectricCarFactory();
        electricCarFactory.getCar().produce();
    }
}