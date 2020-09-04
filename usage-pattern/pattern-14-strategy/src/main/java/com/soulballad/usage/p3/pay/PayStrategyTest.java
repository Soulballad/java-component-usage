package com.soulballad.usage.p3.pay;


import com.soulballad.usage.p3.pay.payport.PayStrategy;
import org.junit.Test;

/**
 * Created by Tom.
 */
public class PayStrategyTest {

    @Test
    public void test_pay() {
        Order order = new Order("1", "2020031401000323", 324.5);
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }
}
