package spring_mvc_web_demo3_validations.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import spring_mvc_web_demo3_validations.validation.CustomCode;

public class Customer {
	
	@NotNull(message = "Please Enter  your first name!")
	@Size(min=2, max = 15 , message = "Please Enter in range of 2-15 characters!")
	private String firstName;
	@NotNull(message = "Please Enter  your last name!")
	@Size(min=2, max = 15 , message = "Please Enter in range of 2-15 characters!")
	private String lastName;
	@NotNull(message = "Please Enter  no of tickets!")
	@Min(value = 0, message ="Min tickets is greater or equal to 0")
	@Max(value = 10, message ="Max tickets is lesser or equal to 10")
	private Integer tickets;
	
	@CustomCode(value = "My" , message="must start with My")
	@Pattern(regexp = "^[A-Za-z0-9]{4,8}", message = "Please enter 4 to 8 Characters only")
	@NotNull(message = "Please Enter  your Username!")
	private String userName;
	
	
	
	public Integer getTickets() {
		return tickets;
	}


	public void setTickets(Integer tickets) {
		this.tickets = tickets;
	}


	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Customer() {
		super();
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
