package com.soulballad.usage.p1.general;

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
