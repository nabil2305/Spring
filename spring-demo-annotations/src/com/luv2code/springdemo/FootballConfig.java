package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class FootballConfig 
{
	@Bean
	public FortuneService customFortuneService() {
	return new CustomFortuneService();
	}
	
	@Bean
	public Coach footBallCoach()
	{
		return new FootBallCoach(customFortuneService());
	}

}
