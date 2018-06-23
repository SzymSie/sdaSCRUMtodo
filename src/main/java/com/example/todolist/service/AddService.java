package com.example.todolist.service;

import com.example.todolist.model.TodoTask;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddService {

    private List<TodoTask> tasks = new ArrayList<>();

    public TodoTask get(Integer id) {
        Optional<TodoTask> foundBook = tasks
                .stream()
                .findFirst();


        return foundBook.get();
    }

    public TodoTask put(TodoTask update, Integer id) {
        TodoTask task = get(id);
        task.setName(update.getName());


        return task;
    }

    public TodoTask create(TodoTask newTask) {
        newTask.setId(++TodoTask.instanceNumber);
        tasks.add(newTask);
        return newTask;
    }
}
