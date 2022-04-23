package com.pchauda.example.springbasics.controller;

import com.pchauda.example.springbasics.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/index")
    public String index() {
        return helloWorldService.getGreetingMessage();
    }
}
