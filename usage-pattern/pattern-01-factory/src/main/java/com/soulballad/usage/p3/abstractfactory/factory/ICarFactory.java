package com.soulballad.usage.p3.abstractfactory.factory;

import com.soulballad.usage.p3.abstractfactory.IElectricCar;
import com.soulballad.usage.p3.abstractfactory.IPoliceCar;

/**
 * @author Soulballad
 * @date 2019/3/7/0007 16:50
 * @email soda931vzr@163.com
 */
public interface ICarFactory {

    public IPoliceCar getPoliceCar();

    public IElectricCar getElectricCar();
}