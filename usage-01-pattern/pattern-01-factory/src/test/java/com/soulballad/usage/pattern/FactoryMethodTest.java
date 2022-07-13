package com.soulballad.usage.pattern;


import com.soulballad.usage.pattern.p2.factorymethod.factory.ElectricCarFactory;
import com.soulballad.usage.pattern.p2.factorymethod.factory.GasolineCarFactory;
import com.soulballad.usage.pattern.p2.factorymethod.factory.ICarFactory;
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