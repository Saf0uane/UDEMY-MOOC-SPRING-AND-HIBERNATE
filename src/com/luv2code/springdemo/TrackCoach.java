package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach( FortuneService theFortuneService ) {
        fortuneService = theFortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {

        return "Daily Track";

    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();

    }

}
