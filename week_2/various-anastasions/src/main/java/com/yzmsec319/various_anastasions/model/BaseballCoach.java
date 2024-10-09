package com.yzmsec319.various_anastasions.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {
    public String getDailyWorkout() {
        return "BaseballCoach-GetDailyWorkout()";
    }
    public BaseballCoach() {
        System.out.println("BaseballCoach constructor called");
    }
}
