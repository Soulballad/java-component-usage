package com.soulballad.usage.p1.hungry;

public class HungrySimpleSingleton {

    private static final HungrySimpleSingleton singleton = new HungrySimpleSingleton();

    private HungrySimpleSingleton() {
    }

    public static HungrySimpleSingleton getInstance() {

        return singleton;
    }
}
