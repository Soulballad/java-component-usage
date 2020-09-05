package com.soulballad.usage.p2.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

public interface GPInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}