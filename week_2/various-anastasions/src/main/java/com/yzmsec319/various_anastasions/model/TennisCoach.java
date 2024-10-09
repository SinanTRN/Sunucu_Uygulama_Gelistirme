package com.yzmsec319.various_anastasions.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {
    public String getDailyWorkout() {
        return "TennisCoach- GetDailyWorkout()";
    }
    public TennisCoach() {
        System.out.println("TennisCoach constructor called");
    }
}
