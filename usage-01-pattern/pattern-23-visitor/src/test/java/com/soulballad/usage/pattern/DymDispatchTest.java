package com.soulballad.usage.pattern;

import org.junit.Test;

public class DymDispatchTest {

    @Test
    public void test_dymDispatch() {
        Person man = new Man();
        Person woman = new WoMan();

        man.test();
        woman.test();
    }
}
