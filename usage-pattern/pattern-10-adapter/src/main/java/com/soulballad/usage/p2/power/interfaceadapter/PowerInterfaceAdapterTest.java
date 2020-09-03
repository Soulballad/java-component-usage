package com.soulballad.usage.p2.power.interfaceadapter;

import org.junit.Test;

public class PowerInterfaceAdapterTest {

    @Test
    public void test_powerAdapter() {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }

    @Test
    public void test_powerAdapter2() {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
