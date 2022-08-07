package com.soulballad.usage.netty.bio.servlet;


import com.soulballad.usage.netty.bio.http.BsaRequest;
import com.soulballad.usage.netty.bio.http.BsaResponse;
import com.soulballad.usage.netty.bio.http.BsaServlet;

public class FirstServlet extends BsaServlet {

    public void doGet(BsaRequest request, BsaResponse response) throws Exception {
        this.doPost(request, response);
    }

    public void doPost(BsaRequest request, BsaResponse response) throws Exception {
        response.write("This is First Servlet");
    }

}
