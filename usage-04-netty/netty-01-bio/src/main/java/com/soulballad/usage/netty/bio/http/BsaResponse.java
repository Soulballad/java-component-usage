package com.soulballad.usage.netty.bio.http;

import java.io.OutputStream;


public class BsaResponse {
    private final OutputStream out;

    public BsaResponse(OutputStream out) {
        this.out = out;
    }

    public void write(String s) throws Exception {
        //用的是HTTP协议，输出也要遵循HTTP协议
        //给到一个状态码 200
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html;\n")
                .append("\r\n")
                .append(s);
        out.write(sb.toString().getBytes());
    }
}
