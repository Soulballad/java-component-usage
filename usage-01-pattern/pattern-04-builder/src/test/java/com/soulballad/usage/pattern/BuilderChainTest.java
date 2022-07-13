package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.chain.CarBuilder;

public class BuilderChainTest {
    public static void main(String[] args) {

        CarBuilder builder =
                new CarBuilder().addDoor("防弹车门").addEngine("V8发动机").addLight("镭射强光灯").addWheel("防弹轮胎").addAirBag("安全气囊");

        System.out.println(builder.build());

        StringBuilder sb = new StringBuilder();
        sb.append("");

        // CacheBuilder cacheBuilder = new CacheBuilder("");
        // cacheBuilder.blocking(false);
        // // cacheBuilder.
        //
        // SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // // sqlSessionFactoryBuilder.
        //
        // BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
        // beanDefinitionBuilder.

    }
}
