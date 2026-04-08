package com.bnmit;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws Exception {
        HttpServer s = HttpServer.create(new InetSocketAddress(6001), 0);
        s.createContext("/", e -> {
            byte[] r = "Hello from Greeting App".getBytes();
            e.sendResponseHeaders(200, r.length);
            e.getResponseBody().write(r);
            e.close();
        });
        s.start();
        System.out.println("Running on http://localhost:6001");
    }
}
