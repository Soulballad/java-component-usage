package com.soulballad.usage.p3.abstractfactory.factory;

import com.soulballad.usage.p3.abstractfactory.IElectricCar;
import com.soulballad.usage.p3.abstractfactory.IPoliceCar;

public interface ICarFactory {

    public IPoliceCar getPoliceCar();

    public IElectricCar getElectricCar();
}