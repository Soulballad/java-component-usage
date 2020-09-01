package com.soulballad.usage.p2.chatroom;

/**
 * Created by Tom.
 */
public class ChatRoom {

    public void showMsg(User user,String msg){
        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
