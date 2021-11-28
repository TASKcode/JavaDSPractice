package com.github.code.gc.greeting.calculate;

import com.proto.calculate.Calculate;
import com.proto.calculate.CalculateRequest;
import com.proto.calculate.CalculateResponse;
import com.proto.calculate.CalculateServiceGrpc;
import io.grpc.stub.StreamObserver;

public class CalculateServiceImpl extends CalculateServiceGrpc.CalculateServiceImplBase {

    @Override
    public void calculate(CalculateRequest request, StreamObserver<CalculateResponse> responseObserver) {

        //extract the field we need
        Calculate calculate = request.getInput();
        int firstNumber = calculate.getA();
        int secondNumber = calculate.getB();

        //create the response
        int result = firstNumber + secondNumber;
        System.out.println("The Final Output is :: "+result);
        CalculateResponse response = CalculateResponse
                                    .newBuilder()
                                    .setResult(result)
                                    .build();

        //send the response
        responseObserver.onNext(response);
        //complete the RPC call
        responseObserver.onCompleted();
    }
}
