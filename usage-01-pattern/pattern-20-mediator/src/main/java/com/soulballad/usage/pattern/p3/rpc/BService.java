package com.soulballad.usage.pattern.p3.rpc;

public class BService implements IService {
    Registry registry;

    BService() {
        registry.register("bService", this);
    }
}
