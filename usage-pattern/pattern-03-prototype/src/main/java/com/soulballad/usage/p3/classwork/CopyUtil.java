package com.soulballad.usage.p3.classwork;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class CopyUtil {

    public static Object copy(Object object) {

        try {
            Class<?> clazz = object.getClass();
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            Object copyObj = constructor.newInstance();

            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                field.set(copyObj, field.get(object));
            }
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}