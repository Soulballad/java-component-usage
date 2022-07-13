package com.soulballad.usage.pattern;


import com.soulballad.usage.pattern.p3.abstractfactory.factory.AudiCarFactory;
import com.soulballad.usage.pattern.p3.abstractfactory.factory.BenzCarFactory;
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