package com.soulballad.usage.p2.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @author Soulballad
 * @date 2019/3/18/0018 21:47
 * @email soda931vzr@163.com
 * @description
 */
public class GPMeipo implements GPInvocationHandler {

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target, args);
        after();
        return object;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}