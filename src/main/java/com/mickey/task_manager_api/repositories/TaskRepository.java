package com.mickey.task_manager_api.repositories;

import com.mickey.task_manager_api.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
