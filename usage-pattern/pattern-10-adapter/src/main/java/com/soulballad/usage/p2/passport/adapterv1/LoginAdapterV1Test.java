package com.soulballad.usage.p2.passport.adapterv1;

import org.junit.Test;

public class LoginAdapterV1Test {

    @Test
    public void test_loginAdapter() {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login("tom", "123456");
        adapter.loginForQQ("sjooguwoersdfjhasjfsa");
        adapter.loginForWeChat("slfsjoljsdo8234ssdfs");
    }
}
