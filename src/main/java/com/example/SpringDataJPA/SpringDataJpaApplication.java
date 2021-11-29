package com.example.SpringDataJPA;

import com.example.SpringDataJPA.model.Customer;
import com.example.SpringDataJPA.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class  SpringDataJpaApplication{

	private static final Logger log = LoggerFactory.getLogger(SpringDataJpaApplication.class);
	//o que recebe as solicitações de log,  o que pretende enviar e receber informações da nossa classe

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// retornando um array com os parâmetros de firstName e LastName
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// buscando todos os clientes
			log.info("Clientes encontrados pelo: findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// buscando os clientes pelo id
			Customer customer = repository.findById(1L);
			log.info("Encontrar cliente pelo ID: findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// buscando os clientes pelo ultimo nome
			log.info("Cliente buscado pelo: findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}
