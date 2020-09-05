package com.soulballad.usage.p2.passport.adapterv2.adapters;

import com.soulballad.usage.p2.passport.ResultMsg;

public class LoginForQQAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        //accesseToken
        //time
        return super.loginForRegist(id, null);
    }
}
