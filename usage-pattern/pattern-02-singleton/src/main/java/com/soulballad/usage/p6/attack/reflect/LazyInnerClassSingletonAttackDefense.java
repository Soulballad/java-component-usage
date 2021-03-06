package com.soulballad.usage.p6.attack.reflect;

import java.lang.reflect.Constructor;

/**
 * 静态内部类单例防御反射攻击，反射是通过构造函数来创建实例，那么需要判断实例是否已被创建，如果已创建则抛出异常
 */
public class LazyInnerClassSingletonAttackDefense {

    private LazyInnerClassSingletonAttackDefense() {

        synchronized (LazyInnerClassSingletonAttackDefense.class) {
            if (null != LazyHolder.singleton) {

                throw new RuntimeException("不能通过反射创建单例！");
            }
        }
    }

    public static LazyInnerClassSingletonAttackDefense getInstance() {

        return LazyHolder.singleton;
    }

    private static class LazyHolder {

        private static final LazyInnerClassSingletonAttackDefense singleton =
                new LazyInnerClassSingletonAttackDefense();
    }

    /**
     * 测试防御静态内部类单例的反射攻击
     *
     * @param args
     */
    public static void main(String[] args) {

        Class<LazyInnerClassSingletonAttackDefense> innerClassSingletonClass =
                LazyInnerClassSingletonAttackDefense.class;

        try {

            Constructor<LazyInnerClassSingletonAttackDefense> constructor =
                    innerClassSingletonClass.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazyInnerClassSingletonAttackDefense singleton1 = constructor.newInstance();

            System.out.println(singleton1);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
