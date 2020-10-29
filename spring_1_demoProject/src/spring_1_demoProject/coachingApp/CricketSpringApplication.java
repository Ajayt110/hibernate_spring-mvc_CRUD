package spring_1_demoProject.coachingApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketSpringApplication {

	 
	public static void main(String[] args) {

	
		
		// Load Configuration XML file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Add beans
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		
		// Calling the methods of the class
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDietPlan());
		System.out.println(coach.getCoachName());
		System.out.println(coach.getEmailId());
		

		//Context Close
		context.close();
		

	}

}
