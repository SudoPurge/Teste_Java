package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Mono<Task> getTaskById(String id) {
        return taskRepository.findById(id);
    }

    public Mono<Task> createTask(Task task) {
        return taskRepository.save(task);
    }

    public Mono<Task> updateTask(String id, Task task) {
        return taskRepository.findById(id)
                .flatMap(existingTask -> {
                    existingTask.setName(task.getName());
                    existingTask.setStatus(task.getStatus());
                    return taskRepository.save(existingTask);
                });
    }

    public Mono<Void> deleteTask(String id) {
        return taskRepository.findById(id)
                .flatMap(existingTask -> taskRepository.deleteById(id));
    }
}
