package com.soulballad.usage.p1.general.simple;

import org.junit.Test;

public class SimpleStateTest {

    @Test
    public void test_simple() {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
