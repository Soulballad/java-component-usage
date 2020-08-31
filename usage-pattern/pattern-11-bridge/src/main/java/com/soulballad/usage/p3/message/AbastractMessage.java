package com.soulballad.usage.p3.message;

public abstract class AbastractMessage {
    private IMessage message;

    public AbastractMessage(IMessage message) {
        this.message = message;
    }

    void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }
}
