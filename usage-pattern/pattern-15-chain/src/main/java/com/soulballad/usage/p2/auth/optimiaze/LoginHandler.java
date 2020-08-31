package com.soulballad.usage.p2.auth.optimiaze;

import com.soulballad.usage.p2.auth.Member;

public class LoginHandler extends Handler {
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        next.doHandler(member);
    }
}
