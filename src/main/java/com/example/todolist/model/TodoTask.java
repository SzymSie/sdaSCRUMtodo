package com.example.todolist.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class TodoTask {
    public static int instanceNumber =0;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
}
