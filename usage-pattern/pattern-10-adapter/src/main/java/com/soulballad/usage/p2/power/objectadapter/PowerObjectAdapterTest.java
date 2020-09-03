package com.soulballad.usage.p2.power.objectadapter;


import org.junit.Test;

public class PowerObjectAdapterTest {

    @Test
    public void test_powerAdapter() {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
