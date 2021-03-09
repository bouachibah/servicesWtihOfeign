package com.id;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.id.entities.Compte;
import com.id.repository.CompteRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(CompteRepository compteRos) {
		return args->{
			compteRos.save(new Compte(null,2000,compteType.EPARNE,new Date()));
			compteRos.save(new Compte(null,3000,compteType.COURNAT,new Date()));
			
		};
	}

}
