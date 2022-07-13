package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.power.objectadapter.AC220;
import com.soulballad.usage.pattern.p2.power.objectadapter.DC5;
import com.soulballad.usage.pattern.p2.power.objectadapter.PowerAdapter;
import org.junit.Test;

public class PowerObjectAdapterTest {

    @Test
    public void test_powerAdapter() {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
