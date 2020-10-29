package spring_mvc_hibernate.service;

import java.util.List;

import spring_mvc_hibernate.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(Integer id);

	public void deleteCustomer(Integer id);

}