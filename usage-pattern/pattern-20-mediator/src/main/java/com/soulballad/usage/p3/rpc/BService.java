package com.soulballad.usage.p3.rpc;

public class BService implements IService {
    Registy registy;

    BService() {
        registy.regist("bService", this);
    }
}
