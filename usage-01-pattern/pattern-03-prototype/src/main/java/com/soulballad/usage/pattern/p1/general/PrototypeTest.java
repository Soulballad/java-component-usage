package com.soulballad.usage.pattern.p1.general;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {

        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setId(1);
        concretePrototypeA.setName("zhangsan");
        List hobbies = new ArrayList();
        concretePrototypeA.setHobbies(hobbies);

        Client client = new Client(concretePrototypeA);
        ConcretePrototypeA prototype = (ConcretePrototypeA) client.startClone(concretePrototypeA);

        System.out.println(prototype);

        System.out.println("克隆对象中的引用类型地址值：" + prototype.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + concretePrototypeA.getHobbies());
        System.out.println("对象地址比较：" + (prototype.getHobbies() == concretePrototypeA.getHobbies()));
    }
}