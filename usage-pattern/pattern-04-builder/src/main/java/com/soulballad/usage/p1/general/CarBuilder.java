package com.soulballad.usage.p1.general;

/**
 * @author ：soulballad
 * @version : v1.0
 * @apiNote : builder
 * @since ：2020/9/2 20:41
 */
public class CarBuilder {

    private Car car = new Car();

    public void addDoor(String door) {
        car.setDoor(door);
    }

    public void addWheel(String wheel) {
        car.setWheel(wheel);
    }

    public void addEngine(String engine) {
        car.setEngine(engine);
    }

    public void addLight(String light) {
        car.setLight(light);
    }

    public void addAirBag(String airBag) {
        car.setAirBag(airBag);
    }

    public Car build() {
        return car;
    }
}
