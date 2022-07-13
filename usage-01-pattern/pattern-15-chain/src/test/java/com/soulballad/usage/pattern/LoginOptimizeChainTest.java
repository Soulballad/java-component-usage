package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.auth.optimize.MemberService;
import org.junit.Test;

public class LoginOptimizeChainTest {

    @Test
    public void test_loginOptChain() {
        MemberService memberService = new MemberService();
        memberService.login("tom", "666");
    }
}
