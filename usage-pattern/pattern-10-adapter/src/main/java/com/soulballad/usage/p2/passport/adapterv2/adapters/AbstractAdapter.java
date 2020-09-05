package com.soulballad.usage.p2.passport.adapterv2.adapters;

import com.soulballad.usage.p2.passport.PassportService;
import com.soulballad.usage.p2.passport.ResultMsg;

public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.register(username, password);
        return super.login(username, password);
    }
}
