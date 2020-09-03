package com.soulballad.usage.p2.passport.adapterv1;


import com.soulballad.usage.p2.passport.ResultMsg;

public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWeChat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelPhone(String phone, String code);

}
