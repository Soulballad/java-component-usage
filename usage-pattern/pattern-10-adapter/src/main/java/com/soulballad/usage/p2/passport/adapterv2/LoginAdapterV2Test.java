package com.soulballad.usage.p2.passport.adapterv2;

import org.junit.Test;

public class LoginAdapterV2Test {

    @Test
    public void test_loginAdapter() {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");
    }
}
