package com.task.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.api.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {} // <class,id>
