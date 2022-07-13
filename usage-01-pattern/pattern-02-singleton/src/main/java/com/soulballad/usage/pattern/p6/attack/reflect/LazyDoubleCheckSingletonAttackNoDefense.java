package com.soulballad.usage.pattern.p6.attack.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 懒汉式暂时无法防御反射攻击
 */
public class LazyDoubleCheckSingletonAttackNoDefense {

    private static LazyDoubleCheckSingletonAttackNoDefense singleton = null;
    private static boolean flag = false;

    private LazyDoubleCheckSingletonAttackNoDefense() {

        synchronized (LazyDoubleCheckSingletonAttackNoDefense.class) {

            // 无法防止反射攻击
            if (false == flag) {

                flag = !flag;

            } else {

                throw new RuntimeException("不能通过反射创建单例！");
            }

            // 无法防止反射攻击
            /*if (null != singleton) {
            
                throw new RuntimeException("不能通过反射创建单例！");
            }*/
        }
    }

    public static LazyDoubleCheckSingletonAttackNoDefense getInstance() {

        if (null == singleton) {

            synchronized (LazyDoubleCheckSingletonAttackNoDefense.class) {
                if (null == singleton) {

                    singleton = new LazyDoubleCheckSingletonAttackNoDefense();
                }
            }
        }

        return singleton;
    }

    public static void main(String[] args) {

        Class<LazyDoubleCheckSingletonAttackNoDefense> attackDefenseClass =
                LazyDoubleCheckSingletonAttackNoDefense.class;

        try {

            Constructor<LazyDoubleCheckSingletonAttackNoDefense> constructor =
                    attackDefenseClass.getDeclaredConstructor(null);
            Field field = attackDefenseClass.getDeclaredField("flag");

            constructor.setAccessible(true);
            field.setAccessible(true);
            field.set(LazyDoubleCheckSingletonAttackNoDefense.class, false);

            LazyDoubleCheckSingletonAttackNoDefense instance = constructor.newInstance();
            System.out.println(instance);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
