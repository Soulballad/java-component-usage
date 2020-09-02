package com.soulballad.usage.p3.rpc;

public class AService implements IService {
    Registy registy;

    AService() {
        registy.regist("aService", this);
    }

    public void a() {
        // registy.get("bService").xxx();
    }
}
