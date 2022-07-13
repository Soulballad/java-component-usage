package com.soulballad.usage.pattern.p2.lazy;

/**
 * 懒汉式的双重校验，也是使用synchronized加锁，相对于在getInstance方法上加锁而言，缩小了锁的粒度，使其他线程可以对该方法进行访问，线程安全，性能比直接在getInstance方法上加锁要好
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {

        if (null == singleton) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null == singleton) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return singleton;
    }
}
