package com.soulballad.usage.p2.passport.old;

/**
 * @author Soulballad
 * @date 2019/3/23/0023 11:10
 * @email soda931vzr@163.com
 * @description
 */
public class SigninService implements ISigninService{

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }
}