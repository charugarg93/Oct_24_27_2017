package com.traffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Scope("prototype")
public class Person {

    @Value("Sam")
    private String name;

    //@Resource(name = "stockList")
    private List<String> stock;

    @Autowired
    private Car car;

    public List<String> getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }
}
