package com.soulballad.usage.pattern.acl;

import org.apache.curator.framework.AuthInfo;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;
import org.apache.zookeeper.ZooDefs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.apache.zookeeper.server.auth.DigestAuthenticationProvider.generateDigest;

public class AclDemo {

    private static String CONNECTION_STR = "192.168.13.102:2181,192.168.13.103:2181,192.168.13.104:2181";


    public static void main(String[] args) throws Exception {
        demo2();
    }

    private static void demo2() throws Exception {


        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(CONNECTION_STR).sessionTimeoutMs(5000).
                authorization("digest", "admin:admin".getBytes()).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();
        List<ACL> list = new ArrayList<>();
        ACL acl = new ACL(ZooDefs.Perms.READ | ZooDefs.Perms.WRITE,
                new Id("digest", generateDigest("admin:admin")));
        list.add(acl);
        curatorFramework.setACL().withACL(ZooDefs.Ids.CREATOR_ALL_ACL).forPath("/temp");
//        curatorFramework.create().withMode(CreateMode.PERSISTENT).withACL(list).forPath("/auth");
    }

    /*private static void demo1(){
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(CONNECTION_STR).sessionTimeoutMs(5000).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();
        List<ACL> list=new ArrayList<>();
        ACL acl=new ACL(ZooDefs.Perms.READ | ZooDefs.Perms.WRITE,
                new Id("digest", DigestAuthenticationProvider.generateDigest("admin:admin")));
        list.add(acl);
        curatorFramework.create().withMode(CreateMode.PERSISTENT).withACL(list).forPath("/auth");
    }*/

    public void add() throws Exception {
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(CONNECTION_STR).sessionTimeoutMs(5000).
                authorization("digest", "admin:admin".getBytes()).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();

        List<ACL> acls = new ArrayList<>();
        Id id1 = new Id("digest", generateDigest("u1:us"));
        Id id2 = new Id("digest", generateDigest("u2:us"));
        acls.add(new ACL(ZooDefs.Perms.ALL, id1));
        //针对  u1，有所有权限，针对u2 有读和删除权限
        acls.add(new ACL(ZooDefs.Perms.DELETE | ZooDefs.Perms.READ, id2));
        curatorFramework.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).withACL(acls).forPath("/auth", "sc".getBytes());


        List<ACL> list = new ArrayList<>();
        // 使用 digest 设定权限，digest 通过用户名和密码来鉴权， generateDigest：使用SHA1加密
        ACL acl1 = new ACL(ZooDefs.Perms.READ | ZooDefs.Perms.WRITE, new Id("digest", generateDigest("admin:admin")));
        // 使用 ip 设定权限
        ACL ac2 = new ACL(ZooDefs.Perms.READ | ZooDefs.Perms.WRITE, new Id("ip", "127.0.0.1"));
        // 使用 world 设定开放权限
        ACL acl = new ACL(ZooDefs.Perms.READ | ZooDefs.Perms.WRITE, new Id("world", "anyone"));
        list.add(acl);
        // 修改节点的权限
        curatorFramework.setACL().withACL(list).forPath("/temp");
        // curator 提供的权限类型 CREATOR_ALL_ACL，OPEN_ACL_UNSAFE，READ_ACL_UNSAFE，ANYONE_ID_UNSAFE，AUTH_IDS
        curatorFramework.setACL().withACL(ZooDefs.Ids.OPEN_ACL_UNSAFE).forPath("/test");
        // 初始权限
        curatorFramework.create().withMode(CreateMode.PERSISTENT).withACL(list).forPath("/auth");

        // 修改节点的权限
        curatorFramework.setACL().withACL(list).forPath("/temp");
        // curator 提供的权限类型 CREATOR_ALL_ACL，OPEN_ACL_UNSAFE，READ_ACL_UNSAFE，ANYONE_ID_UNSAFE，AUTH_IDS
        curatorFramework.setACL().withACL(ZooDefs.Ids.OPEN_ACL_UNSAFE).forPath("/test");
    }

    public void access() {
        List<AuthInfo> authInfos = Collections.singletonList(new AuthInfo("digest", "u1:us".getBytes()));
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString("192.168.13.102:2181").sessionTimeoutMs(5000).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).
                authorization(authInfos).namespace("curator").build();
        curatorFramework.start();
    }

}
