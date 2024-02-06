package com.example.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin("http://localhost:3000")
@Slf4j
public class HelloContorller {

    @GetMapping("/test")
    public String getData() {
        return "hello world!!!";
    }

    @PostMapping("/test")
    public Boolean postData(@RequestBody String val) {
        return val != null;
    }

}
