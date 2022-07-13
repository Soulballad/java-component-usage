package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.Abstraction;
import com.soulballad.usage.pattern.p1.general.ConcreteImplementorA;
import com.soulballad.usage.pattern.p1.general.IImplementor;
import com.soulballad.usage.pattern.p1.general.RefinedAbstraction;
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
