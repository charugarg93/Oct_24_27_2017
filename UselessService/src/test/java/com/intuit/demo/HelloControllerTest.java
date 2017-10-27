package com.intuit.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.ContentResultMatchers;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @MockBean
    private HelloController helloController;


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sum()throws Exception{
        when(helloController.calculateSum(10,20)).thenReturn(30);
        mockMvc.perform(get("/sum/10/20")).
                andExpect(status().isOk()).
                andExpect(content().string("30"));
    }

    @Test
    public void sayHello() throws Exception {
        when(helloController.sayHello("sam")).thenReturn("Hi sam");

        //SENSLESS TEST
        //assertTrue(helloController.sayHello("sam").equals("Hi sam"));

        mockMvc.perform(get("/hello/sam")).
                andExpect(status().isOk()).
                andExpect(content().string("Hi sam"));

    }

}