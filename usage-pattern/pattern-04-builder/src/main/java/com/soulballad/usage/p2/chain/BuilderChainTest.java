package com.soulballad.usage.p2.chain;

import org.apache.ibatis.mapping.CacheBuilder;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

public class BuilderChainTest {
    public static void main(String[] args) {

        CarBuilder builder =
                new CarBuilder().addDoor("防弹车门").addEngine("V8发动机").addLight("镭射强光灯").addWheel("防弹轮胎").addAirBag("安全气囊");

        System.out.println(builder.build());

        StringBuilder sb = new StringBuilder();
        sb.append("");

        CacheBuilder cacheBuilder = new CacheBuilder("");
        cacheBuilder.blocking(false);
        // cacheBuilder.

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // sqlSessionFactoryBuilder.

        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
        // beanDefinitionBuilder.

    }
}
