package com.soulballad.usage.pattern.p4.guava;

import com.google.common.eventbus.Subscribe;

public class VoEvent {

    @Subscribe
    public void observer(Vo arg) {
//        if(arg instanceof Vo){
        System.out.println("执行VoEvent方法，传参为：" + arg);
//        }

    }

}
