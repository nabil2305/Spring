package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricetCoach inside setter method of setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("CricetCoach inside setter method of setTeam");
		this.team = team;
	}


	public CricketCoach()
	{
		System.out.println("CricetCoach inside no arg ctor");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
	System.out.println("CricetCoach inside setter methof");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practise fast bowling for 15mins";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Ravi Shashtri";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
