package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService thefortuneService)
//	{
//		fortuneService=thefortuneService;
//	}
	
	public TennisCoach()
	{
		System.out.println(">>inside of default constructor");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService thefortuneService)
//	{
//		System.out.println(">>inside of default setter method");
//		fortuneService = thefortuneService;
//	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice you backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
