package com.soulballad.usage.p2.simple;

import org.junit.Test;

public class EmployeeDelegateTest {

    @Test
    public void test_employee() {
        new Boss().command("海报图", new Leader());
        new Boss().command("爬虫", new Leader());
        new Boss().command("卖手机", new Leader());
    }
}
