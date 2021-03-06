package com.soulballad.usage.p2.lazy;

/**
 * 懒汉式的常见写法，当两个线程同时进入getInstance方法时，两个线程同时判断是否为null，然后都去创建对象，导致对象创建2次，是线程不安全的，不能保证单例
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton singleton = null;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {

        if (null == singleton) {
            singleton = new LazySimpleSingleton();
        }

        return singleton;
    }
}
