package com.soulballad.usage.pattern;

import com.soulballad.usage.pattern.p2.gper.AppContext;
import org.junit.Test;

public class LoginStateTest {

    @Test
    public void test_login() {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("评论：好文章，360个赞");
    }
}
