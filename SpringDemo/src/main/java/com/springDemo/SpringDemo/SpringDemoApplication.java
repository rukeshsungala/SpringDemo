package com.springDemo.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

		/*Normal Object
		Alien obj = new Alien();
		 */

		Alien obj = context.getBean(Alien.class);
		obj.code();

	}

}
