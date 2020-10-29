package hibernate_demo2.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourses {

	public static void main(String[] args) {
		SessionFactory sessionFactory= new Configuration().configure()
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession(); 
		
		try {
			
			int id=6, id1=7;
			
			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, id);
			Instructor instructor1 = session.get(Instructor.class, id1);
			
		Course course1=new Course("Ninjutsu");
		Course course2=new Course("Genjutsu");
		Course course3=new Course("Taijutsu");
		
		instructor.add(course1);
		instructor.add(course2);
		
		instructor1.add(course3);
		instructor1.add(course1);
		
		session.save(course1);
		session.save(course2);
		session.save(course3);
			
			session.getTransaction().commit();
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
