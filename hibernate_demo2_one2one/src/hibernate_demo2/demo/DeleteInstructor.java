package hibernate_demo2.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructor {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
				.configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		
		
		
		try {
			int id=3;
			int id2=2;
			session.beginTransaction();
			Instructor tempInstructor = session.get(Instructor.class, id);
			Instructor tempInstructor2 = session.get(Instructor.class, id2);
			
			
			
			if(tempInstructor!=null && tempInstructor2!=null)
			{
				session.delete(tempInstructor);
				session.delete(tempInstructor2);
			}
			
			session.getTransaction().commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			session.close();
		}

	}

}
