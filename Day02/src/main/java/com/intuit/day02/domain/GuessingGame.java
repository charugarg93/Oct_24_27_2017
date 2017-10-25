package com.intuit.day02.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class GuessingGame {
    private int target;
    private int attempts;
    private String message;
    private boolean gameOver;

    public boolean isGameOver() {
        return gameOver;
    }

    public int getAttempts() {
        return attempts;
    }

    public String getMessage() {
        return message;
    }

    public GuessingGame(){
        target = (int)(Math.random()*100);
        System.out.println("Game object created with target " + target);
    }

    public void play(int guess){
        attempts++;
        if(guess > target)
            message = "Aim Lower";
        else if(guess < target)
            message = "Aim Higher";
        else {
            message = "You've got it!!!";
            gameOver = true;
        }
    }
}
