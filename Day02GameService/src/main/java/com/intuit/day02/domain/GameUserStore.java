package com.intuit.day02.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Scope("singleton")
public class GameUserStore {
    private Map<String,GuessingGame> gameMap;

    public GameUserStore(){
        gameMap = new HashMap<>();
    }
    public boolean add(String id){
        if(gameMap.containsKey(id))
            return false;
        else
            gameMap.put(id,new GuessingGame());
        return true;
    }
    public GuessingGame getGameInstance(String id){
        return gameMap.get(id);
    }
}
