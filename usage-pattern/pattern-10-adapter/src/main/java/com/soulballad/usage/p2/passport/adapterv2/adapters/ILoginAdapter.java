package com.soulballad.usage.p2.passport.adapterv2.adapters;

import com.soulballad.usage.p2.passport.ResultMsg;

public interface ILoginAdapter {

    boolean support(Object object);

    ResultMsg login(String id, Object adapter);
}
