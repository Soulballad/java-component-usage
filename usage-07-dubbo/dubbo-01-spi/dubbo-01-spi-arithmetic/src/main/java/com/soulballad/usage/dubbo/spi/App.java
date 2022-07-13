package com.soulballad.usage.dubbo.spi;

import java.util.ServiceLoader;

/**
 * @author Soulballad
 * @date 2019/8/18 15:23
 * @email soda931vzr@163.com
 * @description
 */
public class App {

    public static void main(String[] args) {

        ServiceLoader<Operation> services = ServiceLoader.load(Operation.class);
        for (Operation service : services) {
            int result = service.operate(6, 3);
            System.out.println(result);
        }
    }
}
