package com.intuit.day03.domain;

import javax.persistence.*;

@Entity
@Table(name="game")
public class Game {

    public Game(){
        
    }
    public Game(String name, int target, int attempts) {
        this.name = name;
        this.target = target;
        this.attempts = attempts;
    }

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private int target;
    @Column
    private int attempts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
}
