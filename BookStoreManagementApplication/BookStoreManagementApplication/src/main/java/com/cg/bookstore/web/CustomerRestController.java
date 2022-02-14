package com.cg.bookstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstore.entity.Customer;
import com.cg.bookstore.service.ICustomerService;

@RestController
@RequestMapping("/app")
public class CustomerRestController {
	
	@Autowired
	ICustomerService custService;
	
	@PostMapping("/customer")
	public boolean createCustomer(@RequestBody Customer c)
	{
		custService.createCustomer(c);
		return true;
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer getCustomerId(@PathVariable int customerId)
	{
		return custService.getCustomerById(customerId);
	}
	
	@GetMapping("/customers")
	public List<Customer> listCustomers()
	{
		return custService.getAllCustomers();
	}
	
	@DeleteMapping("/customer/{customerId}")
	public boolean deleteCustomer(@PathVariable int customerId) {
		return custService.deleteCustomerById(customerId);
	}
	
	@GetMapping("/customercity")
	public List<Customer> getCustomerCity(@RequestParam String city)
	{
		return custService.getCustomerByCity(city);
	}
	
	@GetMapping("/customerstate")
	public List<Customer> getCustomerState(@RequestParam String state)
	{
		return custService.getCustomerByState(state);
	}
	
	@GetMapping("/customercountry")
	public List<Customer> getCustomerCountry(@RequestParam String country)
	{
		return custService.getCustomerByCountry(country);
	}
}
