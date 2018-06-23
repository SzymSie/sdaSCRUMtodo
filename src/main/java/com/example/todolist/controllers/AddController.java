package com.example.todolist.controllers;

import com.example.todolist.model.TodoTask;
import com.example.todolist.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class AddController {

    @Autowired
    private AddService addService;

    @GetMapping(path = "/get")
    @ResponseStatus(HttpStatus.OK)
    public List<TodoTask> getAll() {
        return addService.search();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoTask create(@RequestBody TodoTask newBook) {
        return addService.create(newBook);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public TodoTask put(@RequestBody TodoTask task, @PathVariable Integer id) {
        return addService.put(task, id);
    }
}
