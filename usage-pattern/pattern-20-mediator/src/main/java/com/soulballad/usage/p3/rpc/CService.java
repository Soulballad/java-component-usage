package com.soulballad.usage.p3.rpc;

public class CService implements IService {
    Registy registy;

    CService() {
        registy.regist("cService", this);
    }

}
