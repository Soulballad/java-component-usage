package com.soulballad.usage.p2.auth.optimiaze;

import org.apache.commons.lang3.StringUtils;

import com.soulballad.usage.p2.auth.Member;

public class ValidateHandler extends Handler {
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getLoginPass())) {
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        next.doHandler(member);
    }
}
