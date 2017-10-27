package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Sample3Controller {

    //@RequestMapping(value="/sample3",method= RequestMethod.GET,produces="text/plain")
    @RequestMapping("/{id}")
    public Person getPerson(@PathVariable("id")long id){
        Person p = new Person();
        p.setId(id);
        p.setName("Sachin");
        p.setAge(40);
        return p;
    }

}
