package com.soulballad.usage.p2.chain;

public class CarBuilder {

    private final Car car = new Car();

    public CarBuilder addDoor(String door) {
        car.setDoor(door);
        return this;
    }

    public CarBuilder addWheel(String wheel) {
        car.setWheel(wheel);
        return this;
    }

    public CarBuilder addEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder addLight(String light) {
        car.setLight(light);
        return this;
    }

    public CarBuilder addAirBag(String airBag) {
        car.setAirBag(airBag);
        return this;
    }

    public Car build() {
        return car;
    }

    public static class Car {
        // 车门
        private String door;
        // 轮子
        private String wheel;
        // 发动机
        private String engine;
        // 车灯
        private String light;
        // 安全气囊
        private String airBag;

        public String getDoor() {
            return door;
        }

        public void setDoor(String door) {
            this.door = door;
        }

        public String getWheel() {
            return wheel;
        }

        public void setWheel(String wheel) {
            this.wheel = wheel;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public String getLight() {
            return light;
        }

        public void setLight(String light) {
            this.light = light;
        }

        public String getAirBag() {
            return airBag;
        }

        public void setAirBag(String airBag) {
            this.airBag = airBag;
        }

        @Override
        public String toString() {
            return "Car{" + "door='" + door + '\'' + ", wheel='" + wheel + '\'' + ", engine='" + engine + '\'' + ", light='"
                    + light + '\'' + ", airBag='" + airBag + '\'' + '}';
        }
    }
}
