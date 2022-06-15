package com.luv2code.springdemo;

public class CustomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Football coach mood changes with weather,I am angry";
	}

}
