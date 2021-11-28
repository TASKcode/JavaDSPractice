package com.github.code.gc.greeting.client;

import com.proto.calculate.Calculate;
import com.proto.calculate.CalculateRequest;
import com.proto.calculate.CalculateResponse;
import com.proto.calculate.CalculateServiceGrpc;
import com.proto.greet.GreetRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculateClient {

    public static void main(String[] args) {

        System.out.println("In a Calculate Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating Stubs");
        //DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);

        CalculateServiceGrpc.CalculateServiceBlockingStub calculateClient = CalculateServiceGrpc.newBlockingStub(channel);
        Calculate calculate = Calculate.newBuilder()
                              .setA(10)
                              .setB(5)
                              .build();

        CalculateRequest calculatetRequest = CalculateRequest.newBuilder()
                                    .setInput(calculate)
                                    .build();
        CalculateResponse calculateResponse = calculateClient.calculate(calculatetRequest);

        System.out.println("Shuttingdown the channel");
        channel.shutdown();

    }
}
