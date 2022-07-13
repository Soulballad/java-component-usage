package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.simple.Boss;
import com.soulballad.usage.pattern.p2.simple.Leader;
import org.junit.Test;

public class EmployeeDelegateTest {

    @Test
    public void test_employee() {
        new Boss().command("海报图", new Leader());
        new Boss().command("爬虫", new Leader());
        new Boss().command("卖手机", new Leader());
    }
}
