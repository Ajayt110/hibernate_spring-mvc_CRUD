package spring_mvc_hibernate.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import spring_mvc_hibernate.entity.Customer;
@Service
public interface CustomerDAO {
	
	public List<Customer> getCustomers() ;

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(Integer id);

	public void deleteCustomer(Integer id);

}
