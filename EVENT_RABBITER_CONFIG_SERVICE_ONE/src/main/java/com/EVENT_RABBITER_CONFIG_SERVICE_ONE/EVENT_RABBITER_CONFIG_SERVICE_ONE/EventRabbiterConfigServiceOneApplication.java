package com.EVENT_RABBITER_CONFIG_SERVICE_ONE.EVENT_RABBITER_CONFIG_SERVICE_ONE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EventRabbiterConfigServiceOneApplication {

	public static void main(String[] args) {

		System.out.println("config server");
		SpringApplication.run(EventRabbiterConfigServiceOneApplication.class, args);
	}

}
