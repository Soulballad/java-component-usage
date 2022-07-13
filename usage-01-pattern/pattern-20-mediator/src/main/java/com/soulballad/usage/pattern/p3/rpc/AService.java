package com.soulballad.usage.pattern.p3.rpc;

public class AService implements IService {
    Registry registy;

    AService() {
        registy.register("aService", this);
    }

    public void a() {
        // registy.get("bService").xxx();
    }
}
