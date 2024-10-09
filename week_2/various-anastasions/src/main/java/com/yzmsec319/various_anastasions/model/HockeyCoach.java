package com.yzmsec319.various_anastasions.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HockeyCoach implements Coach {
    public String getDailyWorkout() {
        return "HockeyCoach- GetDailyWorkout()";
    }
    public HockeyCoach() {
        System.out.println("HockeyCoach Constructor called");
    }
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("HockeyCoach doMyStartupStuff called");
    }
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("HockeyCoach doMyCleanupStuff called");
    }
}
