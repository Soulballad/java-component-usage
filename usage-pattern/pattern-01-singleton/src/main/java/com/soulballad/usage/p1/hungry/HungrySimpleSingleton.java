package com.soulballad.usage.p1.hungry;

/**
 * @author Soulballad
 * @date 2019/3/10/0010 10:48
 * @email soda931vzr@163.com
 */
public class HungrySimpleSingleton {

    private static final HungrySimpleSingleton singleton = new HungrySimpleSingleton();

    private HungrySimpleSingleton() {}

    public static HungrySimpleSingleton getInstance() {

        return singleton;
    }
}
