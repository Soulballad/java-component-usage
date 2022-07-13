package com.soulballad.usage.pattern;

import org.junit.Test;

public class IntegerTest {

    @Test
    public void test_integer() {
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:" + (a == b));
        System.out.println("c==d:" + (c == d));
    }
}
