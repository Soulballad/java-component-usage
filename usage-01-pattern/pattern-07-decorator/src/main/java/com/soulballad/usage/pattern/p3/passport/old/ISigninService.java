package com.soulballad.usage.pattern.p3.passport.old;

public interface ISigninService {

    ResultMsg login(String username, String password);

    ResultMsg register(String username, String password);
}
