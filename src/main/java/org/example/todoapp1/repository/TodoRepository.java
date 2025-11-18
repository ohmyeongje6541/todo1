package org.example.todoapp1.repository;

import org.example.todoapp1.dto.TodoDto;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TodoRepository {
    // storage 라는 이름의 Map( 키 와 값)을 저장
    private final Map<Long, TodoDto> storage = new ConcurrentHashMap<>();
    private Long nextId = 1L;
}
