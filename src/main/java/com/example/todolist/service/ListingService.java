package com.example.todolist.service;

import com.example.todolist.model.TodoTask;
import com.sun.xml.internal.bind.v2.TODO;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ListingService {

    private List<TodoTask> tasks = new ArrayList<>();

    public List<TodoTask> search() {
        return tasks;
    }
//
//    public Book get() {
//        Optional<TodoTask> foundTask = tasks
//                .stream()
//                .findFirst();
//
//        if (!foundBook.isPresent()) {
//            System.out.println(String.format("Task with id %s is not found", id));
//        }
//        return foundBook.get();
//    }
}
