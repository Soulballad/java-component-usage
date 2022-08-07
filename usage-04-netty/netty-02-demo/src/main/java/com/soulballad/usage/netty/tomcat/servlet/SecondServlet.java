package com.soulballad.usage.netty.tomcat.servlet;


import com.soulballad.usage.netty.tomcat.http.NsaRequest;
import com.soulballad.usage.netty.tomcat.http.NsaResponse;
import com.soulballad.usage.netty.tomcat.http.NsaServlet;

public class SecondServlet extends NsaServlet {

    public void doGet(NsaRequest request, NsaResponse response) throws Exception {
        this.doPost(request, response);
    }

    public void doPost(NsaRequest request, NsaResponse response) throws Exception {
        response.write("This is Second Serlvet");
    }

}
