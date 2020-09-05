package com.soulballad.usage.p2.battercake.v2;

import org.junit.Test;

public class BatterCakeDecoratorTest {

    @Test
    public void test_batterCakeDecorator() {
        BatterCake battercake;
        // 买一个煎饼
        battercake = new BaseBatterCake();
        // 加一个鸡蛋
        battercake = new EggDecorator(battercake);
        // 再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        // 在家根香肠
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + "，总价格：" + battercake.getPrice());
    }
}