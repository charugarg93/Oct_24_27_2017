package com.intuit.day02.web;


import com.intuit.day02.domain.GuessingGame;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DifferentGameController {

    private RestTemplate restTemplate = new RestTemplate();
    private final String gameServiceBaseUrl = "http://localhost:8081/";

    @RequestMapping("/differentgame")
    public String begin(HttpSession httpSession){
        String url = gameServiceBaseUrl + "begin/" + httpSession.getId();
        ResponseEntity<Boolean> gameCreatedResponseEntity = restTemplate.postForEntity(url,null,Boolean.class);
        boolean gameCreated = gameCreatedResponseEntity.getBody();
        System.out.println(gameCreated);
        return "differentgamepage";
    }

    @RequestMapping(value="/differentgame/play",method= RequestMethod.POST)
    public String play(@RequestParam("guess") int guess, HttpSession httpSession, Model model){
        String url = gameServiceBaseUrl + "play/" + httpSession.getId() + "/" + guess;
        ResponseEntity<Map> gamePlayedResponseEntity = restTemplate.postForEntity(url,null,Map.class);
        Map<String,Object> response = gamePlayedResponseEntity.getBody();
        model.addAttribute("attempts","Attempts: " + response.get("attempts"));
        model.addAttribute("message",response.get("message"));
        if((Boolean)response.get("gameOver"))
            return "gameover";
        return "differentgamepage";
    }

}
