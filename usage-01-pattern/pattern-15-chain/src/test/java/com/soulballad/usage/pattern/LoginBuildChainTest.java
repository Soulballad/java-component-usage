package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.auth.builderchain.MemberService;
import org.junit.Test;

public class LoginBuildChainTest {

    @Test
    public void test_loginBuilderChain() {
        MemberService memberService = new MemberService();
        memberService.login("tom", "666");
    }
}
