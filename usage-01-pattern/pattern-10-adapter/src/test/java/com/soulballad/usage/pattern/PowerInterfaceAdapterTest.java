package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.power.interfaceadapter.AC220;
import com.soulballad.usage.pattern.p2.power.interfaceadapter.DC;
import com.soulballad.usage.pattern.p2.power.interfaceadapter.PowerAdapter;
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
