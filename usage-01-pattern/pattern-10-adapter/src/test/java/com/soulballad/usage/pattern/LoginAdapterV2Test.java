package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.passport.adapterv2.IPassportForThird;
import com.soulballad.usage.pattern.p2.passport.adapterv2.PassportForThirdAdapter;
import org.junit.Test;

public class LoginAdapterV2Test {

    @Test
    public void test_loginAdapter() {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");
    }
}
