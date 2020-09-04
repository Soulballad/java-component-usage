package com.soulballad.usage.p1.general;

import org.junit.Test;

public class GeneralCommandTest {

    @Test
    public void test_command() {
        ICommand cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
