package com.soulballad.usage.p2.factorymethod.factory;

import com.soulballad.usage.p2.factorymethod.ElectricCar;
import com.soulballad.usage.p2.factorymethod.ICar;

/**
 * @author Soulballad
 * @date 2019/3/7/0007 16:43
 * @email soda931vzr@163.com
 */
public class ElectricCarFactory implements ICarFactory {

    @Override
    public ICar getCar() {

        return new ElectricCar();
    }
}