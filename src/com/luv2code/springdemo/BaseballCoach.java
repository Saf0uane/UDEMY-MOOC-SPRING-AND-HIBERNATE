package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    // define private field for the dependency
    private FortuneService fortuneService;

    // define constructor for dependency injection
    public BaseballCoach( FortuneService theFortuneService ) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Workout Baseball";

    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();

    }

}
