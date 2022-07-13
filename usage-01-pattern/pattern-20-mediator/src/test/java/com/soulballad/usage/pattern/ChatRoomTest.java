package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.chatroom.ChatRoom;
import com.soulballad.usage.pattern.p2.chatroom.User;
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
