package com.intuit.day02.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class PersonController {

    @RequestMapping("/info")
    //@ResponseBody
    public String getInfo(Model model){
        model.addAttribute("message",new Date().toString());
        System.out.println(model);
        return "information";
        //return "This is response from getInfo() of PersonController";
    }
}
