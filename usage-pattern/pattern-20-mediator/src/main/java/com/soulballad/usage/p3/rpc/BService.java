package com.soulballad.usage.p3.rpc;

public class BService implements IService {
    Registry registry;

    BService() {
        registry.register("bService", this);
    }
}
