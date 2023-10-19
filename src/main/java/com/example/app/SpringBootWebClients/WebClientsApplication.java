package com.example.app.SpringBootWebClients;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

// Вхідна точка в програму.
// @SpringBootApplication позначає головний клас програми.
// @SpringBootApplication інкапсулює анотації @Configuration,
// @EnableAutoConfiguration, @ComponentScan з їхніми атрибутами
// за замовчуванням.
// https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html
@SpringBootApplication
public class WebClientsApplication {

	private static final Logger LOGGER =
			Logger.getLogger(WebClientsApplication.class.getName());

	public static void main(String[] args) {
		// Можемо прибрати це
//		SpringApplication.run(WebClientsApplication.class, args);

		// Формуємо такий код з можливістю
		// уникнення показу банера Spring Boot
		new SpringApplicationBuilder(WebClientsApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);

		LOGGER.info("APP is running...");
	}
}
