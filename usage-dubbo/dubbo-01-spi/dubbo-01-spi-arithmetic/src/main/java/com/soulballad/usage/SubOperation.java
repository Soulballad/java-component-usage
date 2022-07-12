package com.soulballad.usage;

import com.soulballad.usage.Operation;

/**
 * @author Soulballad
 * @date 2019/8/18 15:20
 * @email soda931vzr@163.com
 * @description
 */
public class SubOperation implements Operation {
    @Override
    public int operate(int a, int b) {
        return a - b;
    }
}
