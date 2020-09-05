package com.soulballad.usage.p2.passport.adapterv2.adapters;

import com.soulballad.usage.p2.passport.ResultMsg;

public class LoginForWeChatAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id, null);
    }
}
