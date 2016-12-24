package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // create non argument constructor
    public CricketCoach() {
        System.out.println( "CricketCoach: inside non-arg constructor" );
    }

    // setter
    public void setFortuneService( FortuneService fortuneService ) {
        System.out.println( "CricketCoach inside the setter mehod - setFortuneSrvice" );
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Workout cricket";

    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();

    }

}
