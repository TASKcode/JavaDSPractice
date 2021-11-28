package com.demo.java.code.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Concurrency {
    private static int prime(int p) {
        System.out.println("Hello");
        return 10;
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(() -> IntStream.rangeClosed(1, 10)
                .map(x -> {
                    prime(x);
                    return x;
                })
                .forEach(System.out::println));

        //shutdown the executor after the task is complete
        service.shutdown();
        //sleep current thread until service is shutdown
        while (!service.isTerminated()) {
            Thread.sleep(1000);
        }
        System.out.println("Done");
    }


}
