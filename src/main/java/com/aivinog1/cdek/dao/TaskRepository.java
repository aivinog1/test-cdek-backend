package com.aivinog1.cdek.dao;

import com.aivinog1.cdek.service.TaskDto;

import java.util.List;

public interface TaskRepository {
    void createTask(TaskDto taskDto);

    List<TaskDto> getAllTasks();
}
