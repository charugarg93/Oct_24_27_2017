package com.intuit.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hi " + name + "!!!";
    }

    @RequestMapping(value="/greet",method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_XML_VALUE)
    public String greet(@RequestBody Greetings greetings){
        return "Your greetings request to " + greetings.getName() +
                " for " + greetings.getOccasion() + " sent successfully";
    }

    @RequestMapping(value="/bye",method = RequestMethod.POST)
    public String bye(@RequestBody String name){
        return "Bye " + name;
    }
}
