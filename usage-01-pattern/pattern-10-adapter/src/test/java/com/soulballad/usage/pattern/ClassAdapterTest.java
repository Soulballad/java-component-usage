package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.classadapter.Adapter;
import com.soulballad.usage.pattern.p1.general.classadapter.Target;
import org.junit.Test;

public class ClassAdapterTest {

    @Test
    public void test_adapter() {
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
