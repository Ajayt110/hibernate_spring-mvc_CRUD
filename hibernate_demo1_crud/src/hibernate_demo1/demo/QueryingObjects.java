package hibernate_demo1.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.x.protobuf.MysqlxResultset.FetchDoneMoreOutParamsOrBuilder;

import hibernate_demo1.entity.Student;

public class QueryingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session= sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			List<Student> theStudentsList =session.createQuery("from Student").list();
			
			System.out.println("All the student details" );
			displayStudents(theStudentsList);
			
			theStudentsList=session.createQuery("from Student s where s.lastName='Sri'").list();
			System.out.println("\n\nAll the student details with sri as  lastName" );
			displayStudents(theStudentsList);
			
			theStudentsList=session.createQuery("from Student s " + " where s.lastName='Lee' OR s.firstName='Mal' ").list();
			System.out.println("\n\nAll the student details with 'lee' as  lastName or firtName is 'Mal'" );
			displayStudents(theStudentsList);
			
			theStudentsList =session.createQuery("from Student s " + "Where s.firstName like 'a%' or s.firstName like 'm%'").list();
			System.out.println("\n\nAll the student details firstName starts with 'a' or 'm'" );
			displayStudents(theStudentsList);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
		}
	}

	private static void displayStudents(List<Student> theStudentsList) {
		
		for(Student tempStudent : theStudentsList)
			System.out.println(tempStudent);
	}

}
