package hibernate_demo2.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructor {

	public static void main(String[] args) {

		SessionFactory sessionFactory= new Configuration().configure()
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession(); 
		
		try {
			
			session.beginTransaction();
			
			int id=7;
			
			Instructor instructor=session.get(Instructor.class, id);
			
			System.out.println("Instructor : "+instructor);
			
			System.out.println("Instructor Courses : "+instructor.getCourses());
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
		}

	}
}

