package spring_3_config_annotation.annotations_config_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnoConfigMain {
	
	public static void main(String[] arg) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Coach newCoach= context.getBean("ninjaCoach",Coach.class);
		
		System.out.println(newCoach.coachName());
		
		System.out.println(newCoach.doNinjutsu());
		
		context.close();
		
	}

}
