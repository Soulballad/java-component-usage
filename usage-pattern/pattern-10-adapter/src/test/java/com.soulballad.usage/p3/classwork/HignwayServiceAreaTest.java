package com.soulballad.usage.p3.classwork;

/**
 * @author Soulballad
 * @date 2019/3/23/0023 12:23
 * @email soda931vzr@163.com
 * @description
 */
public class HignwayServiceAreaTest {

    public static void main(String[] args) {

        HighWayServiceArea serviceArea = new HighWayServiceArea();
        serviceArea.service(new GasCar("汽油车"));
        serviceArea.service(new ElectricCar("电动汽车"));
    }
}