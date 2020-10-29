package hibernate_demo1.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_demo1.entity.Student;

public class DeleteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory=new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Student theStudent= session.get(Student.class, 6);
			
			session.delete(theStudent);
			
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			List<Student> studentList = session.createQuery("from Student").list();
			System.out.println("After Deleting: ");
			for(Student temp: studentList )
				System.out.println(temp);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
