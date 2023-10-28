package com.example.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @GetMapping("/home")
    public String sayHello(){
        //comments
        System.out.println("Hello");
        return "Hello";
    }
}
