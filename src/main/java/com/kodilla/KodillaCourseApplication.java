package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);

        Calculator kalkulator = new Calculator();

        int a = 23;
        int b = 7;

        System.out.println(kalkulator.add(a,b));
    }
}
