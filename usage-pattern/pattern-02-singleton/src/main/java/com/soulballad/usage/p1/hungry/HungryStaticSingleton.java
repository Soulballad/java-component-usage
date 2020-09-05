package com.soulballad.usage.p1.hungry;

/**
 * 饿汉式的静态写法，通过静态代码块对对象进行初始化
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton singleton;

    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {

        return singleton;
    }
}
