package com.soulballad.usage.p3.message;

public interface IMessage {
    // 发送消息的内容和接收人
    void send(String message, String toUser);
}
