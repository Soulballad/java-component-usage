package com.soulballad.usage.pattern.p3.rpc;

public class CService implements IService {
    Registry registry;

    CService() {
        registry.register("cService", this);
    }

}
