package com.soulballad.usage.p2.auth.optimize;

import com.soulballad.usage.p2.auth.Member;

public abstract class Handler {
    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);
}
