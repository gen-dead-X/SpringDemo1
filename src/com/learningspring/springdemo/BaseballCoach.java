package com.learningspring.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    private BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    public String getDailyWorkout(){
        return "Train for at least 30 Fuckin Minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}

