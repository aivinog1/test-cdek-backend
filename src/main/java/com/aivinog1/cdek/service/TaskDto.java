package com.aivinog1.cdek.service;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@AllArgsConstructor
@Data
public class TaskDto {
    private final UUID id;
    private final String orderNumber;
    private final OffsetDateTime createdDate;
}
