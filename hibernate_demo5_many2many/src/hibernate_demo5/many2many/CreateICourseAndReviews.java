package hibernate_demo5.many2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_demo5.many2many.entities.Course;
import hibernate_demo5.many2many.entities.Instructor;
import hibernate_demo5.many2many.entities.InstructorDetail;
import hibernate_demo5.many2many.entities.Reviews;
import hibernate_demo5.many2many.entities.Student;

public class CreateICourseAndReviews {

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

			
			  Course course=new Course("The Ninjutsu tutorial : Bootcamp!"); 
			  
			  Course course2=new Course("The Genjutsu tutorial : Bootcamp!"); 
			  
			  course2.add(new Reviews("This is a Awesome.")); 
			  course2.add(new Reviews("This is a gonna be Legen-Wait for it-Dary.")); 
			  
			  course.add(new Reviews("This is a must for Ninja.")); 
			  course.add(new Reviews("This is a Awesome.")); 
			  course.add(new Reviews("This is a gonna be Legen-Wait for it-Dary.")); 
			  course.add(new Reviews("Course is easy even genin could do it, keep more complex jutsus.."));
			  
			  
			  
			
			 
			
			
			session.beginTransaction();
			//Save students and reviews cascaded.
			  session.save(course);
			  session.save(course2);
			  
			  System.out.println("\nCourses and reviews of Courses are saved ");
			
			System.out.println("course is: "+ course);
			System.out.println("Reviews are : " +course.getReviews());
			
			//Create Students
			
			Student student1= new Student("Boruto", "Uzumaki", "Boruto@Ninja.com");
			Student student2= new Student("Sarada", "Uchiha", "sarada@Ninja.com");
			Student student3= new Student("Mitsuki", "Orochi", "Mits@Ninja.com");
			
			//Adding students to course
			course.addStudent(student1);
			course.addStudent(student2);
			
			course2.addStudent(student2);
			course2.addStudent(student3);
			
			//Saving students
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			System.out.println("Students are :" + course.getStudents());
			System.out.println("Students are :" + course2.getStudents());
			
			session.getTransaction().commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
		}

	}
}

