package com.soulballad.usage.p1.general.classadapter;

import org.junit.Test;

public class ClassAdapterTest {

    @Test
    public void test_adapter() {
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
