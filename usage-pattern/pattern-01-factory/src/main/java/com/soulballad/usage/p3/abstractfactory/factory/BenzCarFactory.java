package com.soulballad.usage.p3.abstractfactory.factory;

import com.soulballad.usage.p3.abstractfactory.BenzElectricCar;
import com.soulballad.usage.p3.abstractfactory.BenzPoliceCar;
import com.soulballad.usage.p3.abstractfactory.IElectricCar;
import com.soulballad.usage.p3.abstractfactory.IPoliceCar;

public class BenzCarFactory implements ICarFactory {

    @Override
    public IPoliceCar getPoliceCar() {

        return new BenzPoliceCar();
    }

    @Override
    public IElectricCar getElectricCar() {

        return new BenzElectricCar();
    }
}