package com.techprudent.springbootmongo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
	
	@Autowired
	CustomerRepo cr;

	@Override
	public void run(String... args) throws Exception {

		cr.save(new Customer(UUID.randomUUID().toString(), "customer1", "12","Male"));
		cr.save(new Customer(UUID.randomUUID().toString(), "customer2", "27","Female"));
		cr.save(new Customer(UUID.randomUUID().toString(), "customer3", "32","Female"));
		cr.save(new Customer(UUID.randomUUID().toString(), "customer4", "22","Male"));
		
		
	}

}
