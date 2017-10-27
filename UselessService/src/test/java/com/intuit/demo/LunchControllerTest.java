package com.intuit.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(LunchController.class)
public class LunchControllerTest {
    @MockBean
    private LunchController lunchController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void chai()throws Exception{
        when(lunchController.orderChai(2)).thenReturn("Ordered 2 cups of chai");
        mockMvc.perform(post("/chai/2")).andExpect(status().isOk()).andExpect(content().string("Ordered 2 cups of chai"));
    }

    @Test
    public void eat()throws Exception{
        when(lunchController.eat("Rice")).thenReturn("Eating Rice");
        mockMvc.perform(get("/eat/Rice")).andExpect(status().isOk()).andExpect(content().string("Eating Rice"));
    }

    @Test
    public void testSetup(){
        assertNotNull(lunchController);
    }
}