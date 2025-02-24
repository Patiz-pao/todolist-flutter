package com.todolist.flutter.todolist.Controllor;

import com.todolist.flutter.todolist.Entity.TaskEntity;
import com.todolist.flutter.todolist.Services.MainServices;
import com.todolist.flutter.todolist.Services.domain.taskReq;
import com.todolist.flutter.todolist.Utils.GenericResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class MainControllor {

    private final MainServices mainServices;

    @PostMapping("/addTask")
    public GenericResponse<taskReq> addTask(@RequestBody taskReq req) throws Exception {
        return mainServices.addTask(req);
    }
}
