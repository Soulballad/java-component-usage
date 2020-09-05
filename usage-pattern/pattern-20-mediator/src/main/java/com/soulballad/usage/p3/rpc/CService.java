package com.soulballad.usage.p3.rpc;

public class CService implements IService {
    Registry registry;

    CService() {
        registry.register("cService", this);
    }

}
