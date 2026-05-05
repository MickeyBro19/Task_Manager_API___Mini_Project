package com.mickey.task_manager_api.services;

import com.mickey.task_manager_api.models.Task;
import com.mickey.task_manager_api.models.User;
import com.mickey.task_manager_api.repositories.TaskRepository;
import com.mickey.task_manager_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepo;

    @Autowired
    UserRepository userRepo;

    public Task createTask(int userId, Task task){
        User user=userRepo.findById(userId).orElseThrow(()-> new RuntimeException("User not found"));

        task.setUser(user);

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
