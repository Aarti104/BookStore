package com.cg.bookstore.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import com.cg.bookstore.entity.Customer;

@Service
public interface ICustomerService {
	
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public boolean deleteCustomerById(int customerId);
	public Customer getCustomerById(int customerId);
	public boolean checkCustomerById(int customerId);
	
	public List<Customer> getCustomerByCity(String city);
	public List<Customer> getCustomerByState(String state);
	/*
	
	
	public List<Customer> getCustomerByCountry(String Country);
	public List<Customer> getCustomerByRegisterDate(LocalDate registerOn);
	*/

}
