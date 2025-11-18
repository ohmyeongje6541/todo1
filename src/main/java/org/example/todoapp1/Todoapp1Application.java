package org.example.todoapp1;

import org.example.todoapp1.dto.TodoDto;
import org.example.todoapp1.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Todoapp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Todoapp1Application.class, args);
    }

    @Bean
    public CommandLineRunner init() {
        return args -> {
            TodoRepository todoRepository = new TodoRepository();
            todoRepository.save(new TodoDto(null, "study", "JAVA", false));
            todoRepository.save(new TodoDto(null, "cook", "kimbap", false));
            todoRepository.save(new TodoDto(null, "workout", "run", false));
        };
    }
}




