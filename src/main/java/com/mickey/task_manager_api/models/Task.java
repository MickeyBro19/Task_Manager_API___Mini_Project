package com.mickey.task_manager_api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    private String task;
    private String details;
    private String status;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

}
