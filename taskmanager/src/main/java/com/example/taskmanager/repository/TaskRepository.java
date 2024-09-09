package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;

import reactor.core.publisher.Flux;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends ReactiveMongoRepository<Task, String> {
    Flux<Task> findByCompleted(boolean completed);
}
