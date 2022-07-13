package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.FlyweightFactory;
import com.soulballad.usage.pattern.p1.general.IFlyweight;
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
