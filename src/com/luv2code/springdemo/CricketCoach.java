package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String         emailAddress;
    private String         team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress( String emailAddress ) {
        System.out.println( "CricketCoach inside the setter mehod - setEmailAddress" );
        this.emailAddress = emailAddress;
    }

    public void setTeam( String team ) {
        System.out.println( "CricketCoach inside the setter mehod - setTeam" );
        this.team = team;
    }

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
