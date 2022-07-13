package com.soulballad.usage.pattern.p3.dbroute.proxy;

import com.soulballad.usage.pattern.p3.dbroute.DynamicDataSourceEntity;
import com.soulballad.usage.pattern.p3.dbroute.IOrderService;
import com.soulballad.usage.pattern.p3.dbroute.Order;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {

    private IOrderService orderService;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        Long createTime = order.getCreateTime();
        Integer year = Integer.valueOf(sdf.format(new Date(createTime)));
        DynamicDataSourceEntity.set(year);
        System.out.println("静态代理类自动分配到【DB_" + year + "】数据源处理数据");
        int result = this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return result;
    }
}