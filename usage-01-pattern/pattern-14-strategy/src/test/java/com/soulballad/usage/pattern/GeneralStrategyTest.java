package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p1.general.Context;
import com.soulballad.usage.pattern.p1.general.IStrategy;
import org.junit.Test;

public class GeneralStrategyTest {

    @Test
    public void test_strategy() {
        //选择一个具体策略
        IStrategy strategy = new ConcreteStrategyA();
        //来一个上下文环境
        Context context = new Context(strategy);
        //客户端直接让上下文环境执行算法
        context.algorithm();
    }
}
