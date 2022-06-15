package com.luv2code.springdemo;

public class BaseballCoach implements Coach
{
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 mins in batting cage";
	}

	@Override
	public String name() {
		
		return "Baseball Coach Name = Aaron";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		 }

}
