package com.soulballad.usage.pattern.p6.attack.reflect;

import com.soulballad.usage.pattern.p2.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射对单例进行攻击，发现创建了2个对象，单例被破坏
 */
public class SingletonReflectAttack {

    public static void main(String[] args) {

        Class<LazyInnerClassSingleton> innerClassSingletonClass = LazyInnerClassSingleton.class;

        try {
            // 构造函数被私有化，只能通过强制访问来调用
            Constructor<LazyInnerClassSingleton> constructor = innerClassSingletonClass.getDeclaredConstructor(null);

            constructor.setAccessible(true);
            LazyInnerClassSingleton singleton1 = constructor.newInstance();
            LazyInnerClassSingleton singleton2 = constructor.newInstance();
            LazyInnerClassSingleton singleton3 = LazyInnerClassSingleton.getInstance();

            System.out.println(singleton1);
            System.out.println(singleton2);
            System.out.println(singleton3);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
