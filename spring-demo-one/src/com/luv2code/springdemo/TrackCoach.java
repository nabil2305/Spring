package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	
	public TrackCoach() {}
	public TrackCoach(FortuneService fortuneService) 
	 {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "RUn a hard 5k";
	}

	@Override
	public String name() {
		
		return "Track Coach Name = Cooper";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an init method 
	public void doMyInitMethod()
	{
		System.out.println("trackCoach:inside my domyinit function");
	}
	
	//add a destroyer method
	public void doMyDestMethod()
	{
		System.out.println("trackCoach:inside my domydestroyer function");
	}

}
