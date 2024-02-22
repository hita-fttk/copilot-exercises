package com.example.demo.domain;

import java.util.List;

public class Clazz {
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    private String name;
    private List<Student> list;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Student> getList() {
        return list;
    }
    public void setList(List<Student> list) {
        this.list = list;
    }
}
