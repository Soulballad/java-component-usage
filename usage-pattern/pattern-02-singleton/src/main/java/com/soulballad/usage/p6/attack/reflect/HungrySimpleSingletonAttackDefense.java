package com.soulballad.usage.p6.attack.reflect;

import java.lang.reflect.Constructor;

/**
 * 饿汉式防御反射攻击
 */
public class HungrySimpleSingletonAttackDefense {

    private static boolean flag = false;
    private static final HungrySimpleSingletonAttackDefense singleton = new HungrySimpleSingletonAttackDefense();

    private HungrySimpleSingletonAttackDefense() {

        synchronized (HungrySimpleSingletonAttackDefense.class) {
            if (singleton != null) {

                throw new RuntimeException("不能通过反射创建单例！");
            }
        }
    }

    public static HungrySimpleSingletonAttackDefense getInstance() {

        return singleton;
    }

    public static void main(String[] args) {

        try {
            Class<HungrySimpleSingletonAttackDefense> attackDefenseClass = HungrySimpleSingletonAttackDefense.class;

            Constructor<HungrySimpleSingletonAttackDefense> constructor =
                    attackDefenseClass.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            // Field field = attackDefenseClass.getDeclaredField("flag");
            // field.setAccessible(true);
            // field.setBoolean(HungrySimpleSingletonAttackDefense.class, false);

            HungrySimpleSingletonAttackDefense instance1 = constructor.newInstance();

            System.out.println(instance1);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
