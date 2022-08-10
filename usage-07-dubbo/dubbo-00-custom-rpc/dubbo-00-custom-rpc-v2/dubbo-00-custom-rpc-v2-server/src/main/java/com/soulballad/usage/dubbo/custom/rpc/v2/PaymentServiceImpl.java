package com.soulballad.usage.dubbo.custom.rpc.v2;



@RpcService(IPaymentService.class)
public class PaymentServiceImpl implements IPaymentService {
    @Override
    public void doPay() {
        System.out.println("执行doPay方法");
    }
}
