package com.bnmit;

import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class App {

    public static String greet() {
        return "Hello from Greeting App";
    }

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(6000), 0);

        server.createContext("/", exchange -> {
            String response = greet();
            exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=UTF-8");
            byte[] bytes = response.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            os.close();
        });

        server.start();
        System.out.println("Running on http://localhost:6000");
    }
}
