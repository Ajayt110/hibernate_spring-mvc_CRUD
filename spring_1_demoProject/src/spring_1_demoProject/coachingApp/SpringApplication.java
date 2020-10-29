package spring_1_demoProject.coachingApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {

		/* load Configuration file  */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/* Retrieve bean from the container*/
		AllCoach coach =context.getBean("theCoach",AllCoach.class);
		
		/*Call the methods of the bean*/
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDietPlan());
		
		/* Close the context */
		context.close();
		
	}

}
