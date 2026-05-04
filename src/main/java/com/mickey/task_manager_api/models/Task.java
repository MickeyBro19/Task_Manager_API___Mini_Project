package com.mickey.task_manager_api.models;

import jakarta.persistence.*;

@Entity
public class Task {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int task_id;
    private String task;
    private String details;
    private String status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
