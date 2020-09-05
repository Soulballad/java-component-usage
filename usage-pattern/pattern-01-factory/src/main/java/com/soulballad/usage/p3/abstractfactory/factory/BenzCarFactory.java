package com.soulballad.usage.p3.abstractfactory.factory;

import com.soulballad.usage.p3.abstractfactory.BenzElectricCar;
import com.soulballad.usage.p3.abstractfactory.BenzGasolineCar;
import com.soulballad.usage.p3.abstractfactory.IElectricCar;
import com.soulballad.usage.p3.abstractfactory.IGasolineCar;

public class BenzCarFactory implements ICarFactory {

    @Override
    public IGasolineCar getPoliceCar() {

        return new BenzGasolineCar();
    }

    @Override
    public IElectricCar getElectricCar() {

        return new BenzElectricCar();
    }
}