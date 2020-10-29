package hibernate_demo2.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BiDirectionalDeleteNotCascade {
	
	public static void main (String [] args) {
		
		
		SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session session= sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			int id=5;
			InstructorDetail tempInstructorDetail=session.get(InstructorDetail.class, id);
			// This will set null mapped element so that the data is not deleted on cascade
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			
			session.delete(tempInstructorDetail);
			
			session.getTransaction().commit();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	

}
