package hibernate_demo4.o2o_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateICourseAndReviews {

	public static void main(String[] args) {

		SessionFactory sessionFactory= new Configuration().configure()
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Reviews.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession(); 
		
		try {
			
			//Create Course & Reviews

			
			  Course course=new Course("The Ninjutsu tutorial"); course.add(new
			  Reviews("This is a must for Ninja.")); course.add(new
			  Reviews("This is a Awesome.")); course.add(new
			  Reviews("This is a gonna be Legen-Wait for it-Dary.")); course.add(new
			  Reviews("Course is easy even genin could do it, keep more complex jutsus.."))
			  ;
			  
			  
			  
			  session.save(course);
			 
			
			
			session.beginTransaction();
			
			
			course.setTitle("The Ninjutsu Course : BootCamp!");
			
			System.out.println("course is: "+ course);
			System.out.println("Reviews are : " +course.getReviews());
			
			session.getTransaction().commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
		}

	}
}

