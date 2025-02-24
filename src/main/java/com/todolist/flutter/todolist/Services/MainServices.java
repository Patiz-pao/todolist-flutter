package com.todolist.flutter.todolist.Services;

import com.todolist.flutter.todolist.Entity.TaskEntity;
import com.todolist.flutter.todolist.Repository.TaskOptionRepo;
import com.todolist.flutter.todolist.Services.domain.taskReq;
import com.todolist.flutter.todolist.Utils.GenericResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class MainServices {
    private final TaskOptionRepo taskOptionRepo;

    public GenericResponse<taskReq> addTask(taskReq req) throws Exception{
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setId(UUID.randomUUID().toString());
        taskEntity.setTask(req.getTask());
        taskOptionRepo.save(taskEntity);
        return new GenericResponse<taskReq>(HttpStatus.OK, "Register success", req);
    }
}
