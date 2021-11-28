package com.github.code.gc.greeting.calculate;

import com.github.code.gc.greeting.server.GreetServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculateServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("In Calculator Service");

        Server server = ServerBuilder.forPort(50051)
                .addService(new CalculateServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }

}
