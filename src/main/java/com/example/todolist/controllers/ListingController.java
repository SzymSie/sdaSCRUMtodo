package com.example.todolist.controllers;

import com.example.todolist.model.TodoTask;
import com.example.todolist.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/test", method = RequestMethod.POST)
public class ListingController {

    @Autowired
    private ListingService listingService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TodoTask> getAll() {
        return listingService.search();
    }
}
