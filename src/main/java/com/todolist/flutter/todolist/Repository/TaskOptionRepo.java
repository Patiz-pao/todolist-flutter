package com.todolist.flutter.todolist.Repository;

import com.todolist.flutter.todolist.Entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskOptionRepo extends JpaRepository<TaskEntity, String> {
}
