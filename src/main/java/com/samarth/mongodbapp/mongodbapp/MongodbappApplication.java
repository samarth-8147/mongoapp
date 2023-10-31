package com.samarth.mongodbapp.mongodbapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbappApplication implements CommandLineRunner{
	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongodbappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Customer C1=new Customer("1","samarth","patil");
		Customer C2=new Customer("2","sam","patil");
		Customer C3=new Customer("3","samartha","patil");


		customerRepository.save(C1);
		customerRepository.save(C2);
		customerRepository.save(C3);
		
		System.out.println("**************************");
		List<Customer> customer =customerRepository.findAll();
		for (Customer c : customer ) {
			System.out.println(c.toString());
			
		}
		
	}

}
