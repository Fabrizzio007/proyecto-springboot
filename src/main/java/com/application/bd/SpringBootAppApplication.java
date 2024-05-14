package com.application.bd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.application.bd.Entity.Cliente;
import com.application.bd.Repository.ClienteRepo;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

	@Autowired
	private ClienteRepo repositorio;

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente1 = new Cliente("jorge lopez", "recreo mz h#8", "jorge12@gmail.com", 312456748);
		repositorio.save(cliente1);
	}
}


