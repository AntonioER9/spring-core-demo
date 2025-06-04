package com.antonio.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("BaseballCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "batting practice";
    }
}
