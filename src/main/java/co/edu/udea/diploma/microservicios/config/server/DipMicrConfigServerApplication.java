package co.edu.udea.diploma.microservicios.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DipMicrConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DipMicrConfigServerApplication.class, args);
	}

}
