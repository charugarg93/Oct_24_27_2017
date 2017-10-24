package com.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("classpath:com/lab01/lab01.xml");
        Conference conference = context.getBean("conference",Conference.class);
        conference.printSessionsCount();
    }
}
