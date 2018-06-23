package com.example.todolist.controllers;

import com.example.todolist.model.TodoTask;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TodoControler {
    @RequestMapping (path = "/test", method = RequestMethod.GET)
    public ResponseEntity<TodoTask> test (){
        return ResponseEntity.ok(new TodoTask());
    }
}
