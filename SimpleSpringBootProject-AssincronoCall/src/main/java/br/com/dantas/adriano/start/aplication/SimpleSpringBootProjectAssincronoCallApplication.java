package br.com.dantas.adriano.start.aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//mapeamento dos controllers
@SpringBootApplication(scanBasePackages = {"br.com.dantas"})
public class SimpleSpringBootProjectAssincronoCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootProjectAssincronoCallApplication.class, args);
	}
}
