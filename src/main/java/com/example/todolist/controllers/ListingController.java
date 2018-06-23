package com.example.todolist.controllers;

import com.example.todolist.model.TodoTask;
import com.example.todolist.services.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListingController {

    @Autowired
    private ListingService listingService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TodoTask> getAll() {
        return listingService.search();
    }
}
