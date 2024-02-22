package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.ClassRepository;

@Controller
@RequestMapping("/class")
public class ClassListController {
    @Autowired
    private ClassRepository repository;
    
    @GetMapping("")
    public String index(){
        return "list-classes";
    }

    @GetMapping("/show")
    public String show(){
        List<Class> classes;
        return "list-classes";
    }
}
