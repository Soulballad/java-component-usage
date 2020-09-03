package com.soulballad.usage.p2.power.classadapter;

import org.junit.Test;

public class PowerClassAdapterTest {

    @Test
    public void test_powerAdapter() {
        DC5 adapter = new PowerAdapter();
        adapter.output5V();
    }
}
