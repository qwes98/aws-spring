package com.example.awsspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test!";
    }
}
