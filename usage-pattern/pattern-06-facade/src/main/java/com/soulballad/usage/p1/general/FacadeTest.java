package com.soulballad.usage.p1.general;

import org.junit.Test;

public class FacadeTest {
    // 客户
    @Test
    public void test_facade() {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}