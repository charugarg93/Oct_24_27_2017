package com.intuit.day02.web;

import com.intuit.day02.domain.GameResult;
import com.intuit.day02.domain.GameUserStore;
import com.intuit.day02.domain.GuessingGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    private GameUserStore gameUserStore;

    @RequestMapping(value="/begin/{id}",method= RequestMethod.POST)
    public boolean begin(@PathVariable("id")String id){
        boolean gameCreated = gameUserStore.add(id);
        return gameCreated;
    }

    @RequestMapping(value="/play/{id}/{guess}",method= RequestMethod.POST)
    public GameResult play(@PathVariable("id")String id,@PathVariable("guess")int guess){
        GuessingGame game = gameUserStore.getGameInstance(id);
        game.play(guess);

        GameResult gameResult = new GameResult(guess,game.getAttempts(),game.getMessage(),game.isGameOver());

        return gameResult;
    }


}
