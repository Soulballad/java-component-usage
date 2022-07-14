package com.soulballad.usage.sentinel.dubbo;

import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Soulballad
 * @date 2019/9/2 19:59
 * @email soda931vzr@163.com
 * @description
 */
public class DegradeInitFunc implements InitFunc {
    @Override
    public void init() throws Exception {
        List<DegradeRule> ruleList = new ArrayList<>();
        DegradeRule rule = new DegradeRule();
        rule.setResource("com.soulballad.usage.sentinel.dubbo.SentinelService");
        // 1s内处理5个请求
        rule.setGrade(RuleConstant.DEGRADE_GRADE_RT);
        rule.setCount(10); // 请求的平均响应时间（ms）
        rule.setTimeWindow(5);
        ruleList.add(rule);
        DegradeRuleManager.loadRules(ruleList);
    }
}
