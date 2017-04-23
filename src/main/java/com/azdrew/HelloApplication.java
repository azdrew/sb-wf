package com.azdrew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class HelloApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
