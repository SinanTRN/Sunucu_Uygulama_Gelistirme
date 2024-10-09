package com.yzmsec319.various_anastasions.controller;
import com.yzmsec319.various_anastasions.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class week2_controller {
    @Value("${player.name}")
    private String playerName;
    @Value("${team.name}")
    private String teamName;

    private Coach myCoach;
    private Coach myAnathorerCoach;

    @Autowired
    public week2_controller(@Qualifier("hockeyCoach") Coach coach,
                            @Qualifier("hockeyCoach") Coach coach2) { //
        this.myCoach = coach;
        this.myAnathorerCoach = coach2;
        System.out.println("Controller constructor called");
    }

    @GetMapping("/a")
    public String value_annot(){
        return "Player Name:"+playerName + " Team Name" + teamName;
    }
    @GetMapping("/dailyworkout")
    public String daily_workout(){
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/check")
    public Boolean check(){
        return myCoach==myAnathorerCoach;
    }
}
