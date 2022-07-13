package com.soulballad.usage.pattern.p2.chatroom;

public class ChatRoom {

    public void showMsg(User user, String msg) {
        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
