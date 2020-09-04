package com.soulballad.usage.p1.general;

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
