package com.soulballad.usage.p5.login.v2;

/**
 * @author Soulballad
 * @date 2019/3/23/0023 11:27
 * @email soda931vzr@163.com
 * @description
 */
public class PassportServiceTest {

    public static void main(String[] args) {

        IPassportForThird passport = new PassportForThirdService();
        passport.loginForToken("adfjasldf");
    }
}