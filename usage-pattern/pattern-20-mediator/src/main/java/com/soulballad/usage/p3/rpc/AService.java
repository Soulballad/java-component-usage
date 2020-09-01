package com.soulballad.usage.p3.rpc;

/**
 * Created by Tom.
 */
public class AService implements IService {
    Registy registy;
    AService(){
        registy.regist("aService",this);
    }

    public void a(){
        //registy.get("bService").xxx();
    }
}
