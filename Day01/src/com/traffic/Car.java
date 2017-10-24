package com.traffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;

    public String getModel() {
        return model;
    }

    public Car(@Value("Santro") String model){
        this.model = model;
    }
}
