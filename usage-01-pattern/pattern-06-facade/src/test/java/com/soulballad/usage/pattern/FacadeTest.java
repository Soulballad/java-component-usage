package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.Facade;
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