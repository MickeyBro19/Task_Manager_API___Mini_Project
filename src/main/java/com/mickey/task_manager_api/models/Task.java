package com.mickey.task_manager_api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int task_id;

    private String task;
    private String details;
    private String status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
