package com.aivinog1.cdek.controller;

import com.aivinog1.cdek.service.TaskDto;
import com.aivinog1.cdek.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/get_all")
    public List<TaskDto> getAllTaskDto() {
        return taskService.getAllTasks();
    }

    @PutMapping("/create_new_task")
    public void createNewTask(@RequestBody TaskDto taskDto) {
        taskService.createNewTask(taskDto);
    }
}
