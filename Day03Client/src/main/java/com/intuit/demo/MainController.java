package com.intuit.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/hello/{name}")
    @HystrixCommand(fallbackMethod = "sayHelloFallback")
    public String sayHello(@PathVariable  String name){
        String url = "http://localhost:8080/hello/" + name;
        String output = restTemplate.getForObject(url,String.class);
        return output;
    }

    public String sayHelloFallback(String name, Throwable ex){
        String output = "Hey " + name + "!!! " +
                "You're seeing this message because something has gone wrong. Please try later.";
        output += "  Error: " + ex.getMessage();
        return output;
    }
}
