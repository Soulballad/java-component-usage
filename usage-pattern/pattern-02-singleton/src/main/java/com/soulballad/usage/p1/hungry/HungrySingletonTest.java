package com.soulballad.usage.p1.hungry;

import org.junit.Test;

/**
 * @author Soulballad
 * @date 2019/3/10/0010 10:48
 * @email soda931vzr@163.com
 * @description 饿汉式单例的常见写法
 */
public class HungrySingletonTest {

    @Test
    public void test_hungrySimpleSingleton() {
        HungrySimpleSingleton instance1 = HungrySimpleSingleton.getInstance();
        HungrySimpleSingleton instance2 = HungrySimpleSingleton.getInstance();
        HungrySimpleSingleton instance3 = HungrySimpleSingleton.getInstance();
        HungrySimpleSingleton instance4 = HungrySimpleSingleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
    }

    @Test
    public void test_hungryStaticSingleton() {
        HungryStaticSingleton instance1 = HungryStaticSingleton.getInstance();
        HungryStaticSingleton instance2 = HungryStaticSingleton.getInstance();
        HungryStaticSingleton instance3 = HungryStaticSingleton.getInstance();
        HungryStaticSingleton instance4 = HungryStaticSingleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
    }
}