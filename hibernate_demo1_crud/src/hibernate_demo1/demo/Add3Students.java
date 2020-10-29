package hibernate_demo1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_demo1.entity.Student;

public class Add3Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			
			/*
			 * Student student1=new Student( "Kar", "Lee", "karle@hbih"); Student
			 * student2=new Student( "Mall", "Lee", "lee@hbih"); Student student3=new
			 * Student( "Dong", "Xiam", "Xiam@hbih");
			 */
			session.beginTransaction();
			
			/*
			 * session.save(student1); session.save(student2); session.save(student3);
			 */
			
			//Printing or getting the current student
			Student student4=new Student( "Mal", "Nrt", "mal@hbih"); 
			session.save(student4);
			Student tempStudent = session.get(Student.class, student4.getId());
			
			System.out.println("Current student is :"+tempStudent);
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
			
		}

	}

}
