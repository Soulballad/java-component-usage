package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.interfaceadapter.Adapter;
import com.soulballad.usage.pattern.p1.general.interfaceadapter.Adaptor;
import com.soulballad.usage.pattern.p1.general.interfaceadapter.Target;
import org.junit.Test;

public class InterfaceAdapterTest {

    @Test
    public void test_adapter() {
        Target adapter = new Adapter(new Adaptor()) {
            @Override
            public int request1() {
                return adaptor.specificRequest() / 10;
            }
        };
        int result = adapter.request1();
        System.out.println(result);
    }
}
