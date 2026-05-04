package com.mickey.task_manager_api.services;

import com.mickey.task_manager_api.models.Task;
import com.mickey.task_manager_api.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskService {
    @Autowired
    TaskRepository taskRepo;

    public Task createTask(Task task){
        return taskRepo.save(task);
    }

    public List<Task> getAllTask(){
        return taskRepo.findAll();
    }

    public Task findTaskById(int id){
        return taskRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Task not Found"));
    }

}
