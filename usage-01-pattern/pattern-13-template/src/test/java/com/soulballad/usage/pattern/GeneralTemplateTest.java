package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.AbstractClass;
import com.soulballad.usage.pattern.p1.general.ConcreteClassA;
import com.soulballad.usage.pattern.p1.general.ConcreteClassB;
import org.junit.Test;

public class GeneralTemplateTest {

    @Test
    public void test_template() {
        AbstractClass abc = new ConcreteClassA();
        abc.templateMehthod();
        abc = new ConcreteClassB();
        abc.templateMehthod();
    }
}
