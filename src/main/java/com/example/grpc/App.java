package com.example.grpc;

import io.grpc.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(3000)
            .addService(new GreetingServiceImpl())
            .build();
        
        server.start();
        System.out.println("Server started on port 3000");
        server.awaitTermination();
    }
}
