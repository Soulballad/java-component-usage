package com.soulballad.usage.dubbo.custom.rpc.v1;

public interface IHelloService {

    //
    String sayHello(String content);

    /**
     * 保存用户
     *
     * @param user 用户
     * @return {@link String}
     */
    String saveUser(User user);

}
