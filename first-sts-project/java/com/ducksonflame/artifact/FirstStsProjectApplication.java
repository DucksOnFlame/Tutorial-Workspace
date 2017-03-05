package com.ducksonflame.artifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//(scanBasePackageClass = {FirstStsProjectApplication.class, SomeOtherClass.class})
public class FirstStsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStsProjectApplication.class, args);
	}
}
