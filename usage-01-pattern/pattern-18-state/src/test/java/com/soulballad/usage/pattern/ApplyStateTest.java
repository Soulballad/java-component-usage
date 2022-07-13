package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.apply.ConcreteStateA;
import com.soulballad.usage.pattern.p1.general.apply.Context;
import org.junit.Test;

public class ApplyStateTest {

    @Test
    public void test_apply() {
        com.soulballad.usage.pattern.p1.general.apply.Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
