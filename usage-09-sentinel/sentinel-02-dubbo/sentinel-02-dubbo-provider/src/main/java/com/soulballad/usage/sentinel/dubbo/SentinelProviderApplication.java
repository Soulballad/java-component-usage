package com.soulballad.usage.sentinel.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SentinelProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SentinelProviderApplication.class, args);
//        initFlowRule();
        System.in.read();
    }

//    // 限流规则
//    private static void initFlowRule() {
//        FlowRule flowRule = new FlowRule();
//
//        flowRule.setResource("com.gupao.sentinel.dubbo.api.SentinelService:sayHello(java.lang.String)");
//        flowRule.setCount(10);
//        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        flowRule.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT);
//        flowRule.setLimitApp("sentinel-web"); //设置限流来源
//        FlowRuleManager.loadRules(Collections.singletonList(flowRule));
//    }
}
