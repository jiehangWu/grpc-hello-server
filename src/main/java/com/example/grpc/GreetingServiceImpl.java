package com.example.grpc;

import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting(GreetingServiceOuterClass.HelloRequest request,
            StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {

        System.out.println(request);

        GreetingServiceOuterClass.HelloResponse response_first = GreetingServiceOuterClass.HelloResponse.newBuilder()
                .setGreeting("Hello there, " + request.getHobbies())
                .build();

        // GreetingServiceOuterClass.HelloResponse response_second = GreetingServiceOuterClass.HelloResponse.newBuilder()
        //         .setGreeting("Hello there, " + request.getHobbies()).build();

        responseObserver.onNext(response_first);
        // responseObserver.onNext(response_second);

        responseObserver.onCompleted();
    }
}