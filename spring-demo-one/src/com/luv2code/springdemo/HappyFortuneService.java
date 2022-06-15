package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	String f[]= {"Henceforth I ask not good fortune. I myself am good fortune.","A wise man turns chance into good fortune.","Diligence is the mother of good fortune."};
	
	@Override
	public String getFortune() 
	{
		 int rnd = new Random().nextInt(f.length);
		return f[rnd];
	}

}
