package com.soulballad.usage.p2.battercake.v1;

import org.junit.Test;

/**
 * @author Soulballad
 * @date 2019/3/23/0023 13:43
 * @email soda931vzr@163.com
 * @description
 */
public class BatterCakeTest {

    @Test
    public void test_batterCake() {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "，总价格：" + battercake.getPrice());

        Battercake bateerCakeWithEgg = new BattercakeWithEgg();
        System.out.println(bateerCakeWithEgg.getMsg() + "，总价格：" + bateerCakeWithEgg.getPrice());

        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + "，总价格：" + battercakeWithEggAndSausage.getPrice());
    }
}