package com.soulballad.usage.p4.logger.enumtype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 使用序列化攻击枚举式单例，发现没有风险
 */
public class EnumSingletonSerializeAttack {

    public static void main(String[] args) {

        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.setData(new Object());

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EnumSingleton.obj"));
            oos.writeObject(instance);
            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("EnumSingleton.obj"));
            EnumSingleton singleton = (EnumSingleton) ois.readObject();

            System.out.println(instance.getData() == singleton.getData());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
