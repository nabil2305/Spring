package com.luv2code.springdemo;

public class FootBallCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public FootBallCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practise Penalty shootout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
