package com.example.todolist.controllers;

import com.example.todolist.model.TodoTask;
import com.example.todolist.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {
   @RequestMapping (path = "/test", method = RequestMethod.GET)



    public ResponseEntity<TodoTask> test (){
        return ResponseEntity.ok(new TodoTask());
    }
}
