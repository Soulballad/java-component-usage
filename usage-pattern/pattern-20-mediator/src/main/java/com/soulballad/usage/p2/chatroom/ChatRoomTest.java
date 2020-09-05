package com.soulballad.usage.p2.chatroom;

import org.junit.Test;

public class ChatRoomTest {

    @Test
    public void test_chatRoom() {
        ChatRoom chatRoom = new ChatRoom();

        User tom = new User("Tom", chatRoom);
        User jerry = new User("Jerry", chatRoom);

        tom.sendMessage("Hi! I am Tom.");
        jerry.sendMessage("Hello! My name is Jerry.");
    }
}
