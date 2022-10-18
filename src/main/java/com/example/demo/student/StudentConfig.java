package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner CommandLineRunner(StudentRepository repository){
        return args -> {
           Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JULY, 5),
                    21
            );

            Student alex = new Student(
                    "alex",
                    "alex.jamal@gmail.com",
                    LocalDate.of(2010, JULY, 5),
                    21
            );

            repository.saveAll(

                    List.of(mariam, alex)
            );
        };
    }
}
