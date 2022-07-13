package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.battercake.v2.BaseBatterCake;
import com.soulballad.usage.pattern.p2.battercake.v2.BatterCake;
import com.soulballad.usage.pattern.p2.battercake.v2.EggDecorator;
import com.soulballad.usage.pattern.p2.battercake.v2.SausageDecorator;
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