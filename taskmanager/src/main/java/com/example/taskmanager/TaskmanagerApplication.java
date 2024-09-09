package com.example.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories(basePackages = "com.example.taskmanager.repository")
public class TaskmanagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskmanagerApplication.class, args);
    }
}


