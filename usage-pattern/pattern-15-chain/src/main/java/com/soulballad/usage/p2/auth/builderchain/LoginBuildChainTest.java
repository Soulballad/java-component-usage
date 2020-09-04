package com.soulballad.usage.p2.auth.builderchain;

import org.junit.Test;

public class LoginBuildChainTest {

    @Test
    public void test_loginBuilderChain() {
        MemberService memberService = new MemberService();
        memberService.login("tom", "666");
    }
}
