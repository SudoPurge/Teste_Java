package com.example.taskmanager.service;

import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import org.springframework.stereotype.Service;

@Service
public class LambdaService {

    private final AWSLambda lambdaClient;

    public LambdaService() {
        this.lambdaClient = AWSLambdaClientBuilder.standard().build();
    }

    public void invokeLambdaFunction(String functionName, String payload) {
        InvokeRequest request = new InvokeRequest()
                .withFunctionName(functionName)
                .withPayload(payload);
        lambdaClient.invoke(request);
    }
}
