package hibernate_demo4.o2o_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetCourseAndReviews {

	public static void main(String[] args) {

		SessionFactory sessionFactory= new Configuration().configure()
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Reviews.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession(); 
		
		try {
			
			
			
			
			session.beginTransaction();
			Course course= session.get(Course.class, 10); 
			
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

