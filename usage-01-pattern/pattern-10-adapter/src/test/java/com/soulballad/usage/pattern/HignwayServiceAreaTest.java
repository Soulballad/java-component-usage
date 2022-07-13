package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p3.classwork.ElectricCar;
import com.soulballad.usage.pattern.p3.classwork.GasCar;
import com.soulballad.usage.pattern.p3.classwork.HighWayServiceArea;

public class HignwayServiceAreaTest {

    public static void main(String[] args) {

        HighWayServiceArea serviceArea = new HighWayServiceArea();
        serviceArea.service(new GasCar("汽油车"));
        serviceArea.service(new ElectricCar("电动汽车"));
    }
}