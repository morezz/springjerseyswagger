package com.groza;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootjerseydemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        new SpringbootjerseydemoApplication()
                .configure(new SpringApplicationBuilder(SpringbootjerseydemoApplication.class)).run(args);
    }
}
