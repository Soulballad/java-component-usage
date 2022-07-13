package com.soulballad.usage.pattern.p2.lazy;

/**
 * 懒汉式，给getInstance()加锁，同一时刻只能有一个线程进入到getInstance方法，其余的线程需要等待，相当于把多线程变成顺序执行，可以保证单例，但性能低下
 */
public class LazySimpleSynchronizedSingleton {

    private static LazySimpleSynchronizedSingleton singleton = null;

    private LazySimpleSynchronizedSingleton() {
    }

    public static synchronized LazySimpleSynchronizedSingleton getInstance() {

        if (null == singleton) {
            singleton = new LazySimpleSynchronizedSingleton();
        }

        return singleton;
    }
}
