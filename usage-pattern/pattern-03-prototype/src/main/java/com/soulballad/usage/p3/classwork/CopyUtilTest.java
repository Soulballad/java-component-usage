package com.soulballad.usage.p3.classwork;

import java.util.Date;

public class CopyUtilTest {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(15);
        person.setBirthday(new Date());
        person.setIdCard("123456");
        person.setAddress("Beijing");

        Person copy = (Person) CopyUtil.copy(person);

        System.out.println(person.toString());
        System.out.println(copy.toString());
    }
}