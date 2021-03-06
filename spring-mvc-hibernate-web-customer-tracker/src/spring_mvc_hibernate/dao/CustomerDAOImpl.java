package spring_mvc_hibernate.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring_mvc_hibernate.entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//Inject Hibernate Session
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		//get current session
		
		Session session=sessionFactory.getCurrentSession();
		
		//Get Query
		//Updated order in last name sorted
		
		Query<Customer> theQuery = session.createQuery("from Customer order by lastName",Customer.class);
		//query to result list
		List<Customer> customers=theQuery.getResultList();
		
		//return result

		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(theCustomer);
		
		
	}

	@Override
	public Customer getCustomer(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Customer customer=session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void deleteCustomer(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Query theQuery = session.createQuery("delete from Customer where id=:customerId");
		
		theQuery.setParameter("customerId", id);
		
		theQuery.executeUpdate();
		
	}

}
