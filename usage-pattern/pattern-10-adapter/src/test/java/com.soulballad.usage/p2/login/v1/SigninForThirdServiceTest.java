package com.soulballad.usage.p2.login.v1;


/**
 * @author Soulballad
 * @date 2019/3/23/0023 11:15
 * @email soda931vzr@163.com
 * @description
 */
public class SigninForThirdServiceTest {

    public static void main(String[] args) {

        SigninForThirdService service = new SigninForThirdService();
        service.loginForQQ("aaa");
        service.loginForToken("dfdd");
    }
}