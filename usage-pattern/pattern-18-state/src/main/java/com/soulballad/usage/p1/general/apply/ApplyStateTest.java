package com.soulballad.usage.p1.general.apply;

import org.junit.Test;

public class ApplyStateTest {

    @Test
    public void test_apply() {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
