package com.example.bookservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class BookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }

    /*@Bean
    CommandLineRunner runner(BookRepository bookRepository) {
        return args -> {
          Book book1 = new Book("1", "Title_One",
                  "About_One", "Link_One");
          Book book2 = new Book("2", "Title_Two",
                  "About_Two", "Link_Two");
          Book book3 = new Book("3", "Title_Three",
                  "About_Three", "Link_Three");
          Book book4 = new Book("4", "Title_Four",
                  "About_Four", "Link_Four");

          bookRepository.insert(book1);
          bookRepository.insert(book2);
          bookRepository.insert(book3);
          bookRepository.insert(book4);
        };
    }*/
}
