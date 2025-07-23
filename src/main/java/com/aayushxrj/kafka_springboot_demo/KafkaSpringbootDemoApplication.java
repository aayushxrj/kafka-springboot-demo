package com.aayushxrj.kafka_springboot_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaSpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringbootDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			kafkaTemplate.send("aayushxrj", "Hello kafka! TESTING !!!");
		};
	}
}
