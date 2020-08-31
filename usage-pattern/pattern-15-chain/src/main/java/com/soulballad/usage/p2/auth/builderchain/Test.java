package com.soulballad.usage.p2.auth.builderchain;

public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("tom", "666");
    }
}
