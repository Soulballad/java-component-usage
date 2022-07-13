package com.soulballad.usage.pattern.p3.dbroute;

public class Order {

    private String id;
    private Long createTime;
    private Object orderInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Order(String id, Long createTime, Object orderInfo) {
        this.id = id;
        this.createTime = createTime;
        this.orderInfo = orderInfo;
    }
}