package com.soulballad.usage.pattern.p3.abstractfactory.factory;

import com.soulballad.usage.pattern.p3.abstractfactory.AudiElectricCar;
import com.soulballad.usage.pattern.p3.abstractfactory.AudiGasolineCar;
import com.soulballad.usage.pattern.p3.abstractfactory.IElectricCar;
import com.soulballad.usage.pattern.p3.abstractfactory.IGasolineCar;

public class AudiCarFactory implements ICarFactory {

    @Override
    public IGasolineCar getPoliceCar() {

        return new AudiGasolineCar();
    }

    @Override
    public IElectricCar getElectricCar() {

        return new AudiElectricCar();
    }
}