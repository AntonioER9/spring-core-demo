package com.antonio.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Cricket Coach");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach!!";
    }
}
