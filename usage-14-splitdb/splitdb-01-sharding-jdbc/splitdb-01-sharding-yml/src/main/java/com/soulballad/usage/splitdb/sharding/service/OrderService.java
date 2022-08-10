package com.soulballad.usage.splitdb.sharding.service;

import com.soulballad.usage.splitdb.sharding.dao.OrderDao;
import com.soulballad.usage.splitdb.sharding.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: qingshan
 * @Description: 咕泡学院，只为更好的你
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public long insertOne(Order order) {
        this.orderDao.addOne(order);
        return order.getOrderId();
    }
}