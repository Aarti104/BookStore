package com.cg.bookstore.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstore.entity.Customer;
import com.cg.bookstore.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService
{
	@Autowired
	ICustomerRepository custRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		return custRepository.save(customer);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> list=(List<Customer>) custRepository.findAll();
		return list;
	}

	@Override
	public boolean deleteCustomerById(int customerId) {
		custRepository.deleteById(customerId);
		return true;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		return custRepository.findById(customerId).get() ;
	}

	@Override
	public List<Customer> getCustomerByCity(String city) {
		return custRepository.getCustomerByCity(city);
	}
	
	@Override
	public List<Customer> getCustomerByState(String state) {
		return custRepository.getCustomerByState(state);
	}
	@Override
	public List<Customer> getCustomerByCountry(String country) {
		return custRepository.getCustomerByCountry(country);
	}

	
}
