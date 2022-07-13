package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.power.classadapter.DC5;
import com.soulballad.usage.pattern.p2.power.classadapter.PowerAdapter;
import org.junit.Test;

public class PowerClassAdapterTest {

    @Test
    public void test_powerAdapter() {
        DC5 adapter = new PowerAdapter();
        adapter.output5V();
    }
}
