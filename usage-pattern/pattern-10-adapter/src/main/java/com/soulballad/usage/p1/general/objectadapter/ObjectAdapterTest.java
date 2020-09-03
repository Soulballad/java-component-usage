package com.soulballad.usage.p1.general.objectadapter;

import org.junit.Test;

public class ObjectAdapterTest {

    @Test
    public void test_adapter() {
        Target adapter = new Adapter(new Adaptor());
        int result = adapter.request();
        System.out.println(result);
    }
}
