package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.ConcreteCommand;
import com.soulballad.usage.pattern.p1.general.ICommand;
import com.soulballad.usage.pattern.p1.general.Invoker;
import org.junit.Test;

public class GeneralCommandTest {

    @Test
    public void test_command() {
        ICommand cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
