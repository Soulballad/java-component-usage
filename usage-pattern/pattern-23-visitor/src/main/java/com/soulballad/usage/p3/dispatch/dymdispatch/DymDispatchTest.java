package com.soulballad.usage.p3.dispatch.dymdispatch;

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
