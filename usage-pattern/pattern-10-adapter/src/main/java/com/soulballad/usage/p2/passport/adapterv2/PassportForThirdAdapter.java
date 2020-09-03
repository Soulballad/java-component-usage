package com.soulballad.usage.p2.passport.adapterv2;


import com.soulballad.usage.p2.passport.ResultMsg;
import com.soulballad.usage.p2.passport.adapterv2.adapters.ILoginAdapter;
import com.soulballad.usage.p2.passport.adapterv2.adapters.LoginForQQAdapter;
import com.soulballad.usage.p2.passport.adapterv2.adapters.LoginForTelAdapter;
import com.soulballad.usage.p2.passport.adapterv2.adapters.LoginForTokenAdapter;
import com.soulballad.usage.p2.passport.adapterv2.adapters.LoginForWeChatAdapter;

public class PassportForThirdAdapter implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWeChat(String openId) {
        return processLogin(openId, LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelPhone(String phone, String code) {
        return processLogin(phone, LoginForTelAdapter.class);
    }


    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
