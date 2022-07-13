package com.soulballad.usage.sentinel;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;

public class SentinelDemo {

    private static String resource = "test sentinel";

    // 初始化限流规则
    private static void initFlowRule() {
        // 限流规则的集合
        List<FlowRule> rules = new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        // 资源(方法名称、接口)
        flowRule.setResource(resource);
        // 限流阈值类型（qps、线程数）
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // 限流10个
        flowRule.setCount(10);
        rules.add(flowRule);
        FlowRuleManager.loadRules(rules);
    }

    public static void main(String[] args) {
        initFlowRule();
        while (true) {
            Entry entry = null;
            try {
                // 根据限流规则进行限流
                entry = SphU.entry(resource);
                System.out.println("可以进行访问");
            } catch (BlockException e) { //如果被限流了，那么会抛出这个异常
                e.printStackTrace();
            } finally {
                if (null != entry) {
                    entry.exit();// 释放
                }
            }
        }
    }
}