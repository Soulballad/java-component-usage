package com.soulballad.usage.splitdb.sharding;

import com.soulballad.usage.splitdb.sharding.dao.UserDao;
import com.soulballad.usage.splitdb.sharding.entity.User;
import com.soulballad.usage.splitdb.sharding.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Test
    public void insert1() throws Exception {
        User user = new User();
        // user.setUserId(2673);
        user.setName("test");
        user.setAge(22);
        this.userDao.addOne(user);
        log.info("插入用户id：{}", user.getUserId());
    }
}

