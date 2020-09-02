package com.soulballad.usage.p1.general;

/**
 * @author ：soulballad
 * @version : v1.0
 * @apiNote : car
 * @since ：2020/9/2 20:36
 */
public class Car {
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
