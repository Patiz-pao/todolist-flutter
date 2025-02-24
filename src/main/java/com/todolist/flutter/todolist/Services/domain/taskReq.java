package com.todolist.flutter.todolist.Services.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class taskReq {
    private String id;
    private String task;
}
