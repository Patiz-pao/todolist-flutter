package com.todolist.flutter.todolist.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "task_option")
public class TaskEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "task")
    private String task;
}
