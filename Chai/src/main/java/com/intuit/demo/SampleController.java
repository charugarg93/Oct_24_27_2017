package com.intuit.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleController {

    private Logger logger = Logger.getLogger(SampleController.class);

    @Value("${welcome}")
    private String message;

    private RestTemplate restTemplate = new RestTemplate();
    @RequestMapping("/")
    public String doSomething(){
        logger.info("doSomething in chai controller called");
        String output = restTemplate.getForObject("http://localhost:8080",String.class);
        return output;
    }
}
