package com.soulballad.usage.p1.general.interfaceadapter;


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
