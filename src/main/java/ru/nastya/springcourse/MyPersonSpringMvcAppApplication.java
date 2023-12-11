package ru.nastya.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class MyPersonSpringMvcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPersonSpringMvcAppApplication.class, args);
	}

}
