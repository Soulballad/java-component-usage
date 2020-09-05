package com.soulballad.usage.p3.passport.old;

public class SigninService implements ISigninService {

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }
}