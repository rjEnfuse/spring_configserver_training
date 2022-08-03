package io.enfuse.configapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigAppTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigAppTestApplication.class, args);
	}

}
