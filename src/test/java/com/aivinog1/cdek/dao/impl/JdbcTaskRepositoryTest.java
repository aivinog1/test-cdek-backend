package com.aivinog1.cdek.dao.impl;

import com.aivinog1.cdek.service.TaskDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTaskRepositoryTest {

    @Autowired
    private JdbcTaskRepository jdbcTaskRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void baseTest() {
        String orderNumber = "orderNumber";
        TaskDto taskDto = new TaskDto(null, orderNumber, null);
        jdbcTaskRepository.createTask(taskDto);
        List<TaskDto> taskDtos = jdbcTaskRepository.getAllTasks();
        assertEquals(1, taskDtos.size());
        TaskDto taskDtoFound = taskDtos.get(0);
        assertNotNull(taskDtoFound);
        String orderNumberFound = taskDtoFound.getOrderNumber();
        assertEquals(orderNumber, orderNumberFound);

    }
}