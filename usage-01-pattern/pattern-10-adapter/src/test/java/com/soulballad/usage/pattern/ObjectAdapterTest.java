package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.objectadapter.Adapter;
import com.soulballad.usage.pattern.p1.general.objectadapter.Adaptor;
import com.soulballad.usage.pattern.p1.general.objectadapter.Target;
import org.junit.Test;

public class ObjectAdapterTest {

    @Test
    public void test_adapter() {
        Target adapter = new Adapter(new Adaptor());
        int result = adapter.request();
        System.out.println(result);
    }
}
