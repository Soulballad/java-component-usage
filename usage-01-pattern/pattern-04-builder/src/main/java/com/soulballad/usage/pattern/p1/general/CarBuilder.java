package com.soulballad.usage.pattern.p1.general;

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
