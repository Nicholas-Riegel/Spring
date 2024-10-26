package com.SpringLearning.s07Autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class S07AutowiringApplication {

	public static void main(String[] args) {

		ApplicationContext cont = SpringApplication.run(S07AutowiringApplication.class, args);
		Dev devObj = cont.getBean(Dev.class);
		devObj.build();

	}

}
