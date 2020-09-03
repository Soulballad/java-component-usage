package com.soulballad.usage.p4.jdk.string;

import org.junit.Test;

public class StringTest {

    @Test
    public void test_string() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1 == s2);// true
        System.out.println(s1 == s3);// true
        System.out.println(s1 == s4);// false
        System.out.println(s1 == s9);// false
        System.out.println(s4 == s5);// false
        System.out.println(s1 == s6);// true
    }
}
