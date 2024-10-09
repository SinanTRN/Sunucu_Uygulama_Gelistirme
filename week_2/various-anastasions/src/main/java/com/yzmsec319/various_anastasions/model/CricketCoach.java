package com.yzmsec319.various_anastasions.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {
    public String getDailyWorkout() {
        return "CricketCoach- GetDailyWorkout()";
    }
    public CricketCoach() {
        System.out.println("CricketCoach constructor called");
    }
}
