package com.soulballad.usage.pattern.p2.factorymethod.factory;

import com.soulballad.usage.pattern.p2.factorymethod.ICar;
import com.soulballad.usage.pattern.p2.factorymethod.GasolineCar;

public class GasolineCarFactory implements ICarFactory {

    @Override
    public ICar getCar() {

        return new GasolineCar();
    }
}