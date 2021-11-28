package com.github.code.gc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
    public static void main(String[] args) {

        System.out.println("In a GRPC CLient");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                                .usePlaintext()
                                .build();

        System.out.println("Creating Stubs");
        //DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);

        GreetServiceGrpc.GreetServiceBlockingStub  greetClient = GreetServiceGrpc.newBlockingStub(channel);
        Greeting greeting = Greeting.newBuilder()
                            .setFirstName("Abhishek")
                            .setSecondName("Singh")
                            .build();

        GreetRequest greetRequest = GreetRequest.newBuilder()
                                    .setGreeting(greeting)
                                    .build();
        GreetResponse greetResponse = greetClient.greet(greetRequest);

        System.out.println("Shuttingdown the channel");
        channel.shutdown();

    }
}