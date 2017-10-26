package com.intuit.day02.domain;

public class GameResult {
    private int guess;
    private int attempts;
    private String message;
    private boolean gameOver;
    private int target;


    public GameResult(){}
    public GameResult(int guess, int attempts, String message, boolean gameOver) {
        this.guess = guess;
        this.attempts = attempts;
        this.message = message;
        this.gameOver = gameOver;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
