package com.soulballad.usage.p3.abstractfactory.factory;

import com.soulballad.usage.p3.abstractfactory.AudiElectricCar;
import com.soulballad.usage.p3.abstractfactory.AudiPoliceCar;
import com.soulballad.usage.p3.abstractfactory.IElectricCar;
import com.soulballad.usage.p3.abstractfactory.IPoliceCar;

public class AudiCarFactory implements ICarFactory {

    @Override
    public IPoliceCar getPoliceCar() {

        return new AudiPoliceCar();
    }

    @Override
    public IElectricCar getElectricCar() {

        return new AudiElectricCar();
    }
}