package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p3.pool.ConnectionPool;
import org.junit.Test;

import java.sql.Connection;

public class ConnectionPoolTest {

    @Test
    public void test_connectionPool() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        System.out.println(conn);
    }
}
