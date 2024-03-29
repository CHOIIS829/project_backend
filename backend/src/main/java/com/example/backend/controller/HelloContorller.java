package com.example.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class HelloContorller {
    @GetMapping("/test")
    public String get(){
        return "response Get!";
    }

    @PostMapping("/test")
    public String post(){
        return "response Post!!";
    }

    @PutMapping("/test")
    public String put(){
        return "response Put!!";
    }

    @DeleteMapping("/test")
    public String delete(){
        return "response Delete!!";
    }
}
