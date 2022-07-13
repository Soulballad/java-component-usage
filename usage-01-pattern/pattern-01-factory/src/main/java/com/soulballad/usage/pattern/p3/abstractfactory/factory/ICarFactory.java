package com.soulballad.usage.pattern.p3.abstractfactory.factory;

import com.soulballad.usage.pattern.p3.abstractfactory.IElectricCar;
import com.soulballad.usage.pattern.p3.abstractfactory.IGasolineCar;

public interface ICarFactory {

    IGasolineCar getPoliceCar();

    IElectricCar getElectricCar();
}