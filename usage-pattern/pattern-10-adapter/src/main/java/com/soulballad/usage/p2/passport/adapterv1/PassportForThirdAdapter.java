package com.soulballad.usage.p2.passport.adapterv1;

import com.soulballad.usage.p2.passport.PassportService;
import com.soulballad.usage.p2.passport.ResultMsg;

public class PassportForThirdAdapter extends PassportService implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegister(openId, null);
    }

    @Override
    public ResultMsg loginForWeChat(String openId) {
        return loginForRegister(openId, null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegister(token, null);
    }

    @Override
    public ResultMsg loginForTelPhone(String phone, String code) {
        return loginForRegister(phone, null);
    }

    private ResultMsg loginForRegister(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.register(username, password);
        return super.login(username, password);
    }
}
