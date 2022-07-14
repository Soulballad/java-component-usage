package com.soulballad.usage.pattern.p1.simplefactory.factory;

import com.soulballad.usage.pattern.p1.simplefactory.ElectricCar;
import com.soulballad.usage.pattern.p1.simplefactory.GasolineCar;
import com.soulballad.usage.pattern.p1.simplefactory.ICar;

public class CarFactory {

    public ICar getCar1(String name) {
        if ("gasoline".equals(name)) {
            return new GasolineCar();
        } else if ("electric".equals(name)) {
            return new ElectricCar();
        }
        return null;
    }

    public ICar getCar2(String className) {

        if (!(null == className || "".equals(className))) {
            try {
                return (ICar) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public ICar getCar3(Class<? extends ICar> clazz) {

        if (null != clazz) {
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}