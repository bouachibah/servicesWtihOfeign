package com.id;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.id.entities.Product;
import com.id.repository.ProductRepository;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
	 CommandLineRunner start(ProductRepository productRepository) {
		return args->{
			 productRepository.save(new Product(null,"hp",500,5));
			 productRepository.save(new Product(null,"smartphone",1500,3));
			 productRepository.save(new Product(null,"ordi",700,5));
			 
			 productRepository.findAll().forEach(c->{
				 System.out.println(c.toString());
			 });
		};
		 
	 }
}
