package org.example.todoapp1.repository;

import org.example.todoapp1.dto.TodoDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TodoRepository {
    // storage 라는 이름의 Map( 키 와 값)을 저장
    private final Map<Long, TodoDto> storage = new ConcurrentHashMap<>();
    private Long nextId = 1L;

    public TodoDto save(TodoDto todo) {
        todo.setId(nextId++);     // ① ID 자동 증가하여 부여
        storage.put(todo.getId(), todo);  // ② Map 저장소에 저장
        return todo;              // ③ 저장된 TodoDto 다시 반환
    }

    public List<TodoDto> findAll() {
        return new ArrayList<>(storage.values());
    }
}
