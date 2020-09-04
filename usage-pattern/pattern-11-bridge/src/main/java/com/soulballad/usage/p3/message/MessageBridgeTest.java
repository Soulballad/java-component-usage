package com.soulballad.usage.p3.message;

import org.junit.Test;

public class MessageBridgeTest {

    @Test
    public void test_message() {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NomalMessage(message);
        abstractMessage.sendMessage("加班申请", "王总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请", "王总");
    }
}
