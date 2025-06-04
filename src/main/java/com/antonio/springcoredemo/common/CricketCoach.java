package com.antonio.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Cricket Coach");
    }

    //Define our init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("Cricket Coach doMyStartupStuff");
    }

    //Define our destroy method
    @PreDestroy
    public void doMyShutdownStuff() {
        System.out.println("Cricket Coach doMyShutdownStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach!!";
    }
}
