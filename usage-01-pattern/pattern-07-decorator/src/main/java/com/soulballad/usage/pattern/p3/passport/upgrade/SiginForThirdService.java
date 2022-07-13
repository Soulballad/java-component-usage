package com.soulballad.usage.pattern.p3.passport.upgrade;

import com.soulballad.usage.pattern.p3.passport.old.ResultMsg;

public class SiginForThirdService implements ISiginForThirdService {

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg register(String username, String password) {
        return null;
    }
}