package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.Delegate;
import org.junit.Test;

public class TaskDelegateTest {

    @Test
    public void test_task() {
        new Delegate().doTask();
    }
}
