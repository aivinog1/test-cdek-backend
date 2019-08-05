package com.aivinog1.cdek.service;

import java.util.List;

public interface TaskService {

    void createNewTask(TaskDto taskDto);

    List<TaskDto> getAllTasks();
}
