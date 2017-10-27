package com.intuit.demo;

import org.springframework.stereotype.Component;

@Component
public class Maths {
    public int sum(int a,int b){
       // int i = 10/0;
        return a+b;
    }
}
