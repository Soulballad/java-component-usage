package com.soulballad.usage.pattern.p2.passport.adapterv2;

import com.soulballad.usage.pattern.p2.passport.ResultMsg;

public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWeChat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelPhone(String phone, String code);
}
