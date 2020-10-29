package spring.webapplication.dao;


	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.query.Query;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import spring.webapplication.dto.User;

	@Service
	public class ServiceUser {

		@Autowired
		private static SessionFactory sessionFactory;

		public static boolean save(User user) {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			try {
				session.save(user);
				tx.commit();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
				return false;
			} finally {
				session.clear();
				session.close();
			}
		}

		public static User get(String email, String password) {
			Session session = sessionFactory.openSession();
			try {
				Query<User> query = session.createQuery("From User where email=:Email and password=:Password", User.class);
				query.setParameter("Email", email);
				query.setParameter("Password", password);
				return query.getSingleResult();
			} catch (Exception e) {
				return null;
			} finally {
				session.close();
			}
		}

	
}
