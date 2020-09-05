package com.soulballad.usage.p3.dispatch.staticdispatch;

import org.junit.Test;

public class StaticDispatchTest {
    public void test(String string) {
        System.out.println("string" + string);
    }

    public void test(Integer integer) {
        System.out.println("integer" + integer);
    }

    @Test
    public void test_staticDispatch() {
        String string = "1";
        Integer integer = 1;
        StaticDispatchTest main = new StaticDispatchTest();
        main.test(integer);
        main.test(string);
    }
}
