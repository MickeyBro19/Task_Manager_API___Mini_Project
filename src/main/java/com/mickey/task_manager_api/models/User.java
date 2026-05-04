package com.mickey.task_manager_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    private String name;

    private String email;

}
