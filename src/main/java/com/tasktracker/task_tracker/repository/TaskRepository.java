package com.tasktracker.task_tracker.repository;

import com.tasktracker.task_tracker.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // You don’t need to write any methods here for basic CRUD
}
