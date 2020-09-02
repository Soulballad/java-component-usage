package com.soulballad.usage.p3.abstractfactory.factory;

import com.soulballad.usage.p3.abstractfactory.BenzElectricCar;
import com.soulballad.usage.p3.abstractfactory.BenzPoliceCar;
import com.soulballad.usage.p3.abstractfactory.IElectricCar;
import com.soulballad.usage.p3.abstractfactory.IPoliceCar;

/**
 * @author Soulballad
 * @date 2019/3/7/0007 16:57
 * @email soda931vzr@163.com
 */
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