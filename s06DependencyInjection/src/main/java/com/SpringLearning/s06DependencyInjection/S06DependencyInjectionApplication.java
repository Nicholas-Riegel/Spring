package com.SpringLearning.s06DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class S06DependencyInjectionApplication {

	public static void main(String[] args) {

//		SpringApplication.run(S06DependencyInjectionApplication.class, args); // Creates the container in the jvm

		// OLD WAY
//		Dev obj = new Dev();
//		obj.build();
		// but now it's your responsibility to manage the entire cycle of it

		// NEW WAY
		// maybe the SpringApplication container already has the object, and we just need a reference to it

//		ApplicationContext is the type of the IoC container.

		ApplicationContext cont = SpringApplication.run(S06DependencyInjectionApplication.class, args);
		Dev devObj = cont.getBean(Dev.class);
//
		devObj.build();

	}

}
