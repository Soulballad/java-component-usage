package com.soulballad.usage.netty.bio.http;


public abstract class BsaServlet {
    public void service(BsaRequest request, BsaResponse response) throws Exception {
        if ("GET".equalsIgnoreCase(request.getMethod())) {
            doGet(request, response);
        } else {
            doPost(request, response);
        }
    }

    public abstract void doGet(BsaRequest request, BsaResponse response) throws Exception;

    public abstract void doPost(BsaRequest request, BsaResponse response) throws Exception;
}
