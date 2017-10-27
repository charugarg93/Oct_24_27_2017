package com.intuit.demo;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UselessController {
    private Logger logger = Logger.getLogger(UselessController.class);

    @RequestMapping("/")
    public String hello(){
        logger.info("hello in useless controller called");
        return "Hi useless!";
    }
}
