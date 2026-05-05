package com.mickey.task_manager_api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Task {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int task_id;
    @Getter @Setter
    private String task;
    @Getter @Setter
    private String details;
    @Getter @Setter
    private String status;

    @Setter @Getter
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
