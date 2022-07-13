package com.soulballad.usage.pattern.p3.dbroute;

public class OrderServiice implements IOrderService {

    private OrderDao orderDao;

    public OrderServiice() {

        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {

        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}