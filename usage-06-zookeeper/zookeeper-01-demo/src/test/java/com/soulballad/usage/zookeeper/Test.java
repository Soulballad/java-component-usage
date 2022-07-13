package com.soulballad.usage.zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

public class Test implements Watcher {

    static ZooKeeper zooKeeper;

    static {
        try {
            zooKeeper = new ZooKeeper("localhost:2181", 4000, new Test());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void process(WatchedEvent event) {
        System.out.println("eventType:" + event.getType());
        if (event.getType() == Event.EventType.NodeDataChanged) {
            try {
                zooKeeper.exists(event.getPath(), true);
            } catch (KeeperException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //getData()/  exists  /getChildren
    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        //Curator
        String path = "/watcher";
        if (zooKeeper.exists(path, false) == null) {
            zooKeeper.create("/watcher", "0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
        Thread.sleep(1000);
        System.out.println("-----------");
        Stat stat = zooKeeper.exists(path, true); //true表示使用zookeeper实例中配置的watcher

        System.in.read();
    }

    public static void watch() throws IOException, KeeperException, InterruptedException {
        ZooKeeper zookeeper = new ZooKeeper("192.168.11.152:2181", 4000, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("event.type: " + event.getType());
            }
        });
        String path = "/watcher";
        if (zookeeper.exists(path, false) == null) {
            zookeeper.create("/watcher", "0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }
        Stat stat = zookeeper.exists(path, true); //true表示使用zookeeper实例中配置的watcher
        System.in.read();

        zookeeper.setData("/watcher", "1".getBytes(), -1); //修改节点的值触发监听
    }
}
