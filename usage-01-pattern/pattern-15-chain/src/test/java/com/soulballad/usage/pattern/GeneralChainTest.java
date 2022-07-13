package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.ConcreteHandlerA;
import com.soulballad.usage.pattern.p1.general.ConcreteHandlerB;
import com.soulballad.usage.pattern.p1.general.Handler;
import org.junit.Test;

public class GeneralChainTest {

    @Test
    public void test_chain() {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        handlerA.handleRequest("requestB");
    }
}
