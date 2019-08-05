package com.aivinog1.cdek.service.impl;

import com.aivinog1.cdek.dao.TaskRepository;
import com.aivinog1.cdek.service.TaskDto;
import com.aivinog1.cdek.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    @Transactional
    public void createNewTask(TaskDto taskDto) {
        taskRepository.createTask(taskDto);
    }

    @Override
    public List<TaskDto> getAllTasks() {
        return taskRepository.getAllTasks();
    }
}
