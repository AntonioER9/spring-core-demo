package com.antonio.springcoredemo.config;

import com.antonio.springcoredemo.common.Coach;
import com.antonio.springcoredemo.common.TennisCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean()
    public Coach tennisCoach() {
        return new TennisCoach();
    }
}
