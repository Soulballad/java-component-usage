package com.soulballad.usage.netty.tomcat.http;

public abstract class NsaServlet {

    public void service(NsaRequest request, NsaResponse response) throws Exception {

        //由service方法来决定，是调用doGet或者调用doPost
        if ("GET".equalsIgnoreCase(request.getMethod())) {
            doGet(request, response);
        } else {
            doPost(request, response);
        }

    }

    public abstract void doGet(NsaRequest request, NsaResponse response) throws Exception;

    public abstract void doPost(NsaRequest request, NsaResponse response) throws Exception;
}
