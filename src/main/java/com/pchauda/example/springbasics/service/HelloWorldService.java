package com.pchauda.example.springbasics.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getGreetingMessage() {
        return "Hello World !!";
    }
}
