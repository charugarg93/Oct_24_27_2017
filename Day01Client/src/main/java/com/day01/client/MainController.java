package com.day01.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @Value("${service1.host}")
    private String service1Host;

    @Value("${service1.port}")
    private long service1port;

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/{name}")
    public String getNameOutput(@PathVariable("name")String name){
        String output = null;
        output = restTemplate.getForObject("http://" + service1Host + ":" + service1port + "/hello?name=" + name,String.class );
        return output;
    }
}
