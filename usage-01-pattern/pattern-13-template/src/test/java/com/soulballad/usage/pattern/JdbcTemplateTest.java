package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p3.jdbc.dao.MemberDao;
import org.junit.Test;

import java.util.List;

public class JdbcTemplateTest {

    @Test
    public void test_jdbc() {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
