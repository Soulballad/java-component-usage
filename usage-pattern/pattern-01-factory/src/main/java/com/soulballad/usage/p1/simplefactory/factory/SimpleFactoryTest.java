package com.soulballad.usage.p1.simplefactory.factory;

import com.soulballad.usage.p1.simplefactory.ElectricCar;
import com.soulballad.usage.p1.simplefactory.ICar;
import com.soulballad.usage.p1.simplefactory.GasolineCar;
import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void test_simpleFactory() {

        CarFactory factory = new CarFactory();

        ICar car11 = factory.getCar1("gasoline");
        car11.produce();
        ICar car12 = factory.getCar1("electric");
        car12.produce();

        ICar car21 = factory.getCar2("com.soulballad.usage.p1.simplefactory.GasolineCar");
        car21.produce();
        ICar car22 = factory.getCar2("com.soulballad.usage.p1.simplefactory.ElectricCar");
        car22.produce();

        ICar car31 = factory.getCar3(GasolineCar.class);
        car31.produce();
        ICar car32 = factory.getCar3(ElectricCar.class);
        car32.produce();
    }
}