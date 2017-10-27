package com.intuit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Maths maths;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hi " + name;
    }

    @RequestMapping("/sum/{a}/{b}")
    public int calculateSum(@PathVariable int a, @PathVariable int b){
        return maths.sum(a,b);
    }
}
