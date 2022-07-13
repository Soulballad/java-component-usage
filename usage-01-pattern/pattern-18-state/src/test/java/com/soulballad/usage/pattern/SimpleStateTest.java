package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.simple.ConcreteStateB;
import com.soulballad.usage.pattern.p1.general.simple.Context;
import org.junit.Test;

public class SimpleStateTest {

    @Test
    public void test_simple() {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
