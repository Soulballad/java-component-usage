package com.soulballad.usage.p2.factorymethod.factory;

import com.soulballad.usage.p2.factorymethod.ElectricCar;
import com.soulballad.usage.p2.factorymethod.ICar;

public class ElectricCarFactory implements ICarFactory {

    @Override
    public ICar getCar() {

        return new ElectricCar();
    }
}