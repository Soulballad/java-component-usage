package com.soulballad.usage.p3.jdbc;

import com.soulballad.usage.p3.jdbc.dao.MemberDao;
import org.junit.Test;

import java.util.List;

public class JdbcTemplateTest {

    @Test
    public void test_jdbc() {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
