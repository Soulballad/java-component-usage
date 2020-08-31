package com.soulballad.usage.p2.auth.optimiaze;

import com.soulballad.usage.p2.auth.Member;

public class MemberService {

    public void login(String loginName, String loginPass) {
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandler(new Member(loginName, loginPass));

    }

}
