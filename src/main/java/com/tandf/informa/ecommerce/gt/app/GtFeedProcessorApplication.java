package com.tandf.informa.ecommerce.gt.app;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = { "com.tandf.informa.ecommerce.gt" })
@EntityScan(value = { "com.tandf.informa.ecommerce.gt.models" })
@EnableJms
@EnableJpaRepositories(basePackages = "com.tandf.informa.ecommerce.gt.repository")

public class GtFeedProcessorApplication {


	public static void main(String[] args) {
		SpringApplication.run(GtFeedProcessorApplication.class, args);
	}

	

	@PostConstruct
	public void postConstruct() {
		

	}
}
