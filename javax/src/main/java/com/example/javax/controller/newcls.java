package com.example.javax.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class newcls{

    
    List<String> list = new ArrayList<>();
    @GetMapping("/items")
    public List<String> getItems() {
        return list;
    }
    @PostMapping("/items")
    public String addItem(@RequestBody String item) {
        list.add(item);
        return "Added: " + item;
    }
}