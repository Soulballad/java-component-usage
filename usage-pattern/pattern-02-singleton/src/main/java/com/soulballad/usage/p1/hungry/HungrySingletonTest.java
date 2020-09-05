package com.soulballad.usage.p1.hungry;

import org.junit.Test;

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