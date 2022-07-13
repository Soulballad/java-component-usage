package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.ticket.ITicket;
import com.soulballad.usage.pattern.p2.ticket.TicketFactory;
import org.junit.Test;

public class TicketConnectionPoolTest {

    @Test
    public void test_ticket() {
        ITicket ticket = TicketFactory.queryTicket("北京西", "长沙");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicket("北京西", "长沙");
        ticket.showInfo("软座");
        ticket = TicketFactory.queryTicket("北京西", "长沙");
        ticket.showInfo("硬卧");
    }
}