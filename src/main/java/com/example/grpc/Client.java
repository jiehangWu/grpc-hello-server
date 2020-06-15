package com.example.grpc;

import io.grpc.*;

public class Client {
    
    public static void main(String[] args) throws Exception {
        final String URL = "localhost:3000";
        final ManagedChannel channel = ManagedChannelBuilder.forTarget(URL)
                                        .usePlaintext( true)
                                        .build();
        
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc
                                                                .newBlockingStub(channel);
        
        GreetingServiceOuterClass.HelloRequest request = GreetingServiceOuterClass.HelloRequest.newBuilder()
                                                            .setName("Jiehang")
                                                            .setHobbies("Playing basketball")
                                                            .build();
        
        GreetingServiceOuterClass.HelloResponse response = stub.greeting(request);
        
        System.out.println(response);

        channel.shutdownNow();
    }
}