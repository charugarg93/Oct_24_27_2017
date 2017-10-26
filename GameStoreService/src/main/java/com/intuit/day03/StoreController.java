package com.intuit.day03;


import com.intuit.day03.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {
    @Autowired
    private GameRepository gameRepository;

    @RequestMapping(value="/creategame",method= RequestMethod.POST)
    public boolean create(@RequestParam String name,
                          @RequestParam int target,
                          @RequestParam int attempts){
        Game game = new Game(name,target,attempts);
        gameRepository.save(game);
        return game.getId() > 0;
    }

    @RequestMapping(value="/listgames",method = RequestMethod.POST)
    public List<Game> getAllGameRecords(){
        return gameRepository.findAllByOrderByAttemptsAsc();
    }
}
