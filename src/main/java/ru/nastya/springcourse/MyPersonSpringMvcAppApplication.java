package ru.nastya.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySource("classpath:database.properties")

public class MyPersonSpringMvcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPersonSpringMvcAppApplication.class, args);
	}

}
