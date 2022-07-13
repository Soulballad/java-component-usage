package com.soulballad.usage.pattern.p6.attack.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化攻击单例，把对象序列化之后再反序列化，会重新创建一个实例，没法保证单例
 */
public class HungrySingleSerializeAttack implements Serializable {

    private static final HungrySingleSerializeAttack INSTANCE = new HungrySingleSerializeAttack();

    private HungrySingleSerializeAttack() {
    }

    public static HungrySingleSerializeAttack getInstance() {

        return INSTANCE;
    }

    public static void main(String[] args) {

        try {

            HungrySingleSerializeAttack instance = HungrySingleSerializeAttack.getInstance();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("HungrySingleSerializeAttack.obj"));
            oos.writeObject(instance);
            oos.flush();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("HungrySingleSerializeAttack.obj"));
            HungrySingleSerializeAttack single = (HungrySingleSerializeAttack) ois.readObject();

            System.out.println(instance == single);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
