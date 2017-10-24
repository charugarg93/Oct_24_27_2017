package com.day01;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(value="/hello")
    public String sayHello(@RequestParam(name="name") String name){
        return "Hello " + name;
    }

    @RequestMapping(value="/bye/{name}")
    public String sayBye(@PathVariable(name="name") String name){
        return "Bye " + name;
    }

}
