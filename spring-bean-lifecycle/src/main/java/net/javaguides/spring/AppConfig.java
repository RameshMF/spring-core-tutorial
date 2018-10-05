package net.javaguides.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public DatabaseInitiaizer databaseInitiaizer() {
		return new DatabaseInitiaizer();
	}
}
