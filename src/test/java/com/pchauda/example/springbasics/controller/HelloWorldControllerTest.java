package com.pchauda.example.springbasics.controller;

import com.pchauda.example.springbasics.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    HelloWorldService helloWorldService;

    @Test
    public void getHello() throws Exception {
        Mockito.when(helloWorldService.getGreetingMessage()).thenReturn("Greeting from Prince Chauda");

        mvc.perform(MockMvcRequestBuilders.get("/v1/index").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greeting from Prince Chauda")));
    }
}
