package com.soulballad.usage.pattern.p1.hungry;

public class HungrySimpleSingleton {

    private static final HungrySimpleSingleton singleton = new HungrySimpleSingleton();

    private HungrySimpleSingleton() {
    }

    public static HungrySimpleSingleton getInstance() {

        return singleton;
    }
}
