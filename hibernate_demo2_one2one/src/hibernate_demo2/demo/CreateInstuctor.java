package hibernate_demo2.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateInstuctor {

	public static void main(String[] args) {

		SessionFactory sessionFactory= new Configuration().configure()
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession(); 
		
		try {
			
			Instructor instructor1=new Instructor("Naruto","Uzumaki","Naru@gmail.com");
			
			InstructorDetail instructorDetail1=new InstructorDetail("Naruto Channel","Ramen");
			
			/*
			 * Instructor instructor2=new Instructor("Po","dee","My@gmail.com");
			 * 
			 * InstructorDetail instructorDetail2=new
			 * InstructorDetail("Pos Channel","Music");
			 */
			
			instructor1.setInstructorDetail(instructorDetail1);
			
			/* instructor2.setInstructorDetail(instructorDetail2); */
			
			session.beginTransaction();
			
			session.save(instructor1);
			
			/* session.save(instructor2); */
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
		}

	}
}
