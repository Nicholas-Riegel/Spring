package com.dependencyInjection06.demoDI06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDi06Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoDi06Application.class, args);

		Dev devObj = context.getBean(Dev.class);
		devObj.build();
	}

}
