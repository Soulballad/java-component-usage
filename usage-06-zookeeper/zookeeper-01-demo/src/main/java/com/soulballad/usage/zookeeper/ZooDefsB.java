package com.soulballad.usage.zookeeper;

public class ZooDefsB {
    public interface Perms {
        int READ = 1 << 0;
        int WRITE = 1 << 1;
        int CREATE = 1 << 2;
        int DELETE = 1 << 3;
        int ADMIN = 1 << 4;
        int ALL = READ | WRITE | CREATE | DELETE | ADMIN;
    }
}
