package com.soulballad.usage.p1.general;

import org.junit.Test;

public class AbstractionTest {

    @Test
    public void test_abstraction() {
        // 来一个实现化角色
        IImplementor imp = new ConcreteImplementorA();
        // 来一个抽象化角色，聚合实现
        Abstraction abs = new RefinedAbstraction(imp);
        // 执行操作
        abs.operation();
    }
}
