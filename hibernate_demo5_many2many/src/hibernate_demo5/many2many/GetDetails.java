package hibernate_demo5.many2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_demo5.many2many.entities.Course;
import hibernate_demo5.many2many.entities.Instructor;
import hibernate_demo5.many2many.entities.InstructorDetail;
import hibernate_demo5.many2many.entities.Reviews;
import hibernate_demo5.many2many.entities.Student;

public class GetDetails {

	public static void main(String[] args) {

		SessionFactory sessionFactory= new Configuration().configure()
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Reviews.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession(); 
		
		try {
			
			//Create Course & Reviews

			session.beginTransaction();
			 
			
			Student student1= session.get(Student.class, 1);
			Student student2= session.get(Student.class, 2);
			
			Course course1=session.get(Course.class, 11);
			
			
			
			
			System.out.println("Current Course is :" + course1);
			System.out.println("Current Course Students are :" + course1.getStudents());
			System.out.println("Current Student is :" + student1);
			System.out.println("Current Student courses are :" + student1.getCourses());
			System.out.println("Current Student is :" + student2);
			System.out.println("Current Student courses are :" + student2.getCourses());
			
			
			session.getTransaction().commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
		}

	}
}

