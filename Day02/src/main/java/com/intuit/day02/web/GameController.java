package com.intuit.day02.web;

import com.intuit.day02.domain.GuessingGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class GameController {

    @RequestMapping("/game")
    public String begin(HttpSession httpSession){
        GuessingGame game = new GuessingGame();
        httpSession.setAttribute("game",game);
        return "gamepage";
    }

    @RequestMapping(value="/game/play",method= RequestMethod.POST)
    public String play(@RequestParam("guess") int guess, HttpSession httpSession, Model model){
        GuessingGame game = (GuessingGame)httpSession.getAttribute("game");
        game.play(guess);
        model.addAttribute("attempts","Attempts: " + game.getAttempts());
        model.addAttribute("message",game.getMessage());
        if(game.isGameOver())
            return "gameover";
        return "gamepage";
    }

}
