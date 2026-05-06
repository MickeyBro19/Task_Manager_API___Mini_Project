package com.mickey.task_manager_api.controllers;

import com.mickey.task_manager_api.models.Task;
import com.mickey.task_manager_api.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    TaskService service;

    @PostMapping("/user/{userId}")
    public ResponseEntity<Task> createTask(@PathVariable int userId, @RequestBody Task task){
        return  ResponseEntity.status(HttpStatus.CREATED).body(service.createTask(userId,task));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        return ResponseEntity.ok(service.getAllTask());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findTaskById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findTaskById(id)) ;
    }

    @GetMapping("user/{userId}")
    public ResponseEntity<List<Task>> getTaskByUserId (@PathVariable int userId){
        return ResponseEntity.ok(service.getTaskByUserId(userId));
    }
    @GetMapping("status/{status}")
    public ResponseEntity<List<Task>> getTaskByStatus (@PathVariable String status){
        return ResponseEntity.ok(service.getTaskByStatus(status));
    }
    @GetMapping("/user/{userId}/status/{status}")
    public ResponseEntity<List<Task>> getTasksByUserAndStatus(
            @PathVariable int userId,
            @PathVariable String status) {

        return ResponseEntity.ok(
                service.getTaskByUserIdAndStatus(status, userId)
        );
    }
}
