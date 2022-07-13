package com.soulballad.usage.pattern.p2.auth.builderchain;

import com.soulballad.usage.pattern.p2.auth.Member;

public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        if (null != next) {
            next.doHandler(member);
        }
    }
}
