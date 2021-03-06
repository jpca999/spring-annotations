package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");  
		
		//get the bean from spring container 
			Coach theCoach = context.getBean("tennisCoach", Coach.class );
		
		//call methods on the bean 
		System.out.println("16-  theCoach" +  theCoach.getDailyWorkout() );
		
		System.out.println("18-  theCoach" +  theCoach.getDailyFortune() );
		
		//close container  thatSillyCoach
		context.close();

	}

}
