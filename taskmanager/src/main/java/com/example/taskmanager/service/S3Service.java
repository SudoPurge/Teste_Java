package com.example.taskmanager.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class S3Service {

    private final AmazonS3 s3Client;
    private final String bucketName;

    public S3Service(@Value("${aws.s3.bucket.name}") String bucketName) {
        this.s3Client = AmazonS3ClientBuilder.standard().withRegion("us-east-2").build();
        this.bucketName = bucketName;
    }

    public void uploadFile(String keyName, File file) {
        s3Client.putObject(new PutObjectRequest(bucketName, keyName, file));
    }
}
