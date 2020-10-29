package spring_2_demo_annotations.annotations_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsMain {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(theCoach.getPractice());
		
		System.out.println(theCoach.recreation());
		
		context.close();

	}

}
