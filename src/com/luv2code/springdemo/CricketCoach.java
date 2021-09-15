package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields of email and team
	private String emailAddress;
	private String team;
	
	// Create a no-arg constructor
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
		
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	// Our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Played 10 overs on fast balling";

}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
