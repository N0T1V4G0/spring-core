package com.n0t1v4g0.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// use scanBasePackages to add external packages to enable component scanning.
// internal packages doesn't need to be listed here.
@SpringBootApplication(scanBasePackages = {"com.n0t1v4g0.springcore", "common"})
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
