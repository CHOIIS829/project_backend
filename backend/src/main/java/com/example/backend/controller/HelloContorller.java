package com.example.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
@Slf4j
public class HelloContorller {

    @GetMapping("/test")
<<<<<<< HEAD
    public String getData() {
        return "hello world!!!";
    }

    @PostMapping("/test")
    public Boolean postData(@RequestBody String val) {
        return val != null;
    }

    @GetMapping("/test")
=======
>>>>>>> f78289af1e8ce97ce5155eae13af323f990786d1
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
