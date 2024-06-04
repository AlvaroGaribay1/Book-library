package com.springproject.book_library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookLibraryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookLibraryApiApplication.class, args);
	}

}
