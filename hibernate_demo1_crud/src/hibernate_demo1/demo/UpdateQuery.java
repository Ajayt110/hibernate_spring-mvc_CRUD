package hibernate_demo1.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_demo1.entity.Student;

public class UpdateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session= sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Student theStudent = session.get(Student.class, 4);
			theStudent.setFirstName("Kim");
			
			
			List<Student> studentX=session.createQuery("from Student where id=4").list();
			for(Student temp:studentX)
				System.out.println(temp);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
		}

	}

}
