package com.soulballad.usage.p2.factorymethod.factory;

import com.soulballad.usage.p2.factorymethod.ICar;
import com.soulballad.usage.p2.factorymethod.PoliceCar;

public class PoliceCarFactory implements ICarFactory {

    @Override
    public ICar getCar() {

        return new PoliceCar();
    }
}