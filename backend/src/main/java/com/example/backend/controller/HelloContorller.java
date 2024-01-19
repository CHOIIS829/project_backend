package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class HelloContorller {

    @GetMapping("/hello")
    public String hello(){
        return "hello world!!!";
    }


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
