package com.soulballad.usage.p1.general;

import org.junit.Test;

public class FlyWeightTicketConnectionPoolTest {
    @Test
    public void test_flyWeight() {
        IFlyweight flyweight1 = FlyweightFactory.getFlyweight("aa");
        IFlyweight flyweight2 = FlyweightFactory.getFlyweight("bb");
        flyweight1.operation("a");
        flyweight2.operation("b");
    }
}
