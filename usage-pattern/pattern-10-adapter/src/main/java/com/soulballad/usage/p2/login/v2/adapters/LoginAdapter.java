package com.soulballad.usage.p2.login.v2.adapters;

import com.soulballad.usage.p2.login.ResultMsg;

/**
 * @author Soulballad
 * @date 2019/3/23/0023 11:17
 * @email soda931vzr@163.com
 * @description
 */
public interface LoginAdapter {

    public boolean support(LoginAdapter adapter);

    public ResultMsg login(String id, Object adapter);
}