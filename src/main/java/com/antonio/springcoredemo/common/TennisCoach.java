package com.antonio.springcoredemo.common;

public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Tennis Coach Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis session";
    }
}
