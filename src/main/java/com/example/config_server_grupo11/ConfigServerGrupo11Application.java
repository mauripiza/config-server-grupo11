package com.example.config_server_grupo11;
import org.springframework.cloud.config.server.EnableConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGrupo11Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGrupo11Application.class, args);
	}

}
