package com.soulballad.usage.p3.dbroute;

public class DynamicDataSourceEntity {

    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    private static final String DEFAULT_SOURCE = null;

    public static String get() {
        return local.get();
    }

    public static void set(String source) {
        local.set(source);
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }
}