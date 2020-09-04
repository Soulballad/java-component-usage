package com.soulballad.usage.p2.auth.optimize;

import org.junit.Test;

public class LoginOptimizeChainTest {

    @Test
    public void test_loginOptChain() {
        MemberService memberService = new MemberService();
        memberService.login("tom", "666");
    }
}
