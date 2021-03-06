package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "swim 1000m as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
