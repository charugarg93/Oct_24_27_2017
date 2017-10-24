package com.lab01;

public class Conference {
    private SessionPlanner sessionPlanner;

    public void setSessionPlanner(SessionPlanner sessionPlanner) {
        this.sessionPlanner = sessionPlanner;
    }

    public void printSessionsCount(){
        System.out.println("45 min topics count " + sessionPlanner.get45MinSessionCount());
        System.out.println("50 min topics count " + sessionPlanner.get50MinSessionCount());
        System.out.println("60 min topics count " + sessionPlanner.get60MinSessionCount());
    }
}
