package com.techprudent.springbootmongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	
	@Autowired
	private CustomerRepo cr;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		
		return cr.findAll();
	}
} 
