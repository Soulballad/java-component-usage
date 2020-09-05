package com.soulballad.usage.p3.classwork;

public class HighWayServiceArea extends GasStation {

    public void service(Car car) {
        if (car instanceof GasCar) {
            super.supplyGas(car);
        } else if (car instanceof ElectricCar) {
            this.supplyElectric(car);
        } else {
            throw new RuntimeException("无法提供服务");
        }
    }

    private void supplyElectric(Car car) {
        System.out.println("给[" + car.getName() + "]充电");
    }
}