package com.intuit.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class LunchController {

    @RequestMapping("/eat/{items}")
    public String eat(@PathVariable String items){
        return "Eating " + items;
    }

    @RequestMapping(value="/chai/{count}",method = RequestMethod.POST)
    public String orderChai(@PathVariable int count) {
        return "Ordered " + count + " cups of chai";
    }
}
