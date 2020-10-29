package hibernate_demo2.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InstructorBiDirectional {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory= new Configuration().configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
	
			int id=4;
			
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class,id);
			
			System.out.println("Instructor details are : "+tempInstructorDetail);
			
			System.out.println("Instructor is : "+tempInstructorDetail.getInstructor());
			
			session.getTransaction().commit();
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
