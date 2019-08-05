package com.aivinog1.cdek.dao.impl;

import com.aivinog1.cdek.dao.TaskRepository;
import com.aivinog1.cdek.service.TaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class JdbcTaskRepository implements TaskRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void createTask(TaskDto taskDto) {
        jdbcTemplate.update("INSERT INTO tasks (order_number) VALUES (?)", taskDto.getOrderNumber());
    }

    @Override
    public List<TaskDto> getAllTasks() {
        // @todo #1:30m Let's refactor this part to use special fields of the response from DB.
        return jdbcTemplate.query("SELECT * FROM tasks",
                (resultSet, i) -> new TaskDto(
                        resultSet.getObject(1, UUID.class),
                        resultSet.getString(2),
                        resultSet.getObject(3, OffsetDateTime.class)
                ));
    }
}