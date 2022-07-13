package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p3.message.AbstractMessage;
import com.soulballad.usage.pattern.p3.message.EmailMessage;
import com.soulballad.usage.pattern.p3.message.IMessage;
import com.soulballad.usage.pattern.p3.message.NomalMessage;
import com.soulballad.usage.pattern.p3.message.SmsMessage;
import com.soulballad.usage.pattern.p3.message.UrgencyMessage;
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
