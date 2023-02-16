package com.example.phonestore;

import com.example.phonestore.models.Supplier;
import com.example.phonestore.models.Worker;
import org.hibernate.jdbc.Work;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhonestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonestoreApplication.class, args);
		System.out.println("We draaien!");
		Supplier s = new Supplier();
	}
}
