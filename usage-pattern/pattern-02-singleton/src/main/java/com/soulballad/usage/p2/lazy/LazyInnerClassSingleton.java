package com.soulballad.usage.p2.lazy;

/**
 * 使用静态内部类来创建单例，内部类在父类初始化之前初始化完成
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
    }

    public static LazyInnerClassSingleton getInstance() {

        return LazyHolder.singleton;
    }

    private static class LazyHolder {

        private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
    }
}
